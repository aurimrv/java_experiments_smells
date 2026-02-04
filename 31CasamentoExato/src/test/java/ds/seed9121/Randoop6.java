package ds.seed9121;

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
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) 10, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3002");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 10, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3003");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", 1, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3004");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) '#', "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 100, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3006");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (byte) 10, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 1, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3008");
        ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 1, "hi!", (int) (short) 1);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3009");
        ds.CasamentoExato.forcaBruta("", (int) (byte) 10, "", (int) (byte) -1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3010");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 100, "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3011");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", 10, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3012");
        ds.CasamentoExato.bmhs("hi!", (-1), "", (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (byte) 1, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3014");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 10, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3015");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (byte) 100, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3016");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 100, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3017");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (byte) 1, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3018");
        ds.CasamentoExato.bmh("hi!", (int) (short) -1, "hi!", (int) (short) 1);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3019");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) (short) 1, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", 10, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3021");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 100, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3022");
        ds.CasamentoExato.forcaBruta("hi!", (int) (short) 100, "hi!", (-1));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", 10, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3024");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 0, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3025");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) 'a', "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3026");
        ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 0, "hi!", (int) '4');
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3027");
        ds.CasamentoExato.forcaBruta("", (int) (short) 10, "", (-1));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3028");
        ds.CasamentoExato.forcaBruta("hi!", (int) ' ', "hi!", (int) (short) 0);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3029");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (short) 1, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3030");
        ds.CasamentoExato.bmhs("", (int) (short) 0, "", 0);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3031");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 0, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3032");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) '#', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) (short) 10, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3034");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 0, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) ' ', "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3036");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("", (int) (byte) 100, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 1, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) 'a', "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3039");
        ds.CasamentoExato.bmhs("", (int) (byte) 0, "", (int) (short) 0);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 10, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3041");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (short) 100, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3042");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 1, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3043");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (short) 1, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3044");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (short) 1, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3045");
        ds.CasamentoExato.shiftAndExato("hi!", (int) (short) -1, "hi!", 0);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3046");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) -1, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3047");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 1, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3048");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 10, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3049");
        ds.CasamentoExato.bmhs("hi!", (int) (byte) -1, "hi!", (int) (short) -1);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3050");
        ds.CasamentoExato.bmh("hi!", (-1), "hi!", 0);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3051");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 10, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3052");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) -1, "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3053");
        ds.CasamentoExato.shiftAndExato("", (int) (byte) -1, "hi!", (int) (byte) -1);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3054");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) 'a', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3055");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) ' ', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3056");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 100, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3057");
        ds.CasamentoExato.bmhs("", 0, "", (int) (byte) 0);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3058");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 10, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3059");
        ds.CasamentoExato.forcaBruta("hi!", (int) (short) 0, "hi!", (int) (short) -1);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3060");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) ' ', "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3061");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 10, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3062");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", 10, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3063");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 100, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3064");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (short) 1, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3065");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 10, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3066");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (-1), "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3067");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 100, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3068");
        ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 1, "hi!", 1);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3069");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (byte) 10, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3070");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("", (int) '4', "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3071");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", 0, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3072");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", 1, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3073");
        ds.CasamentoExato.forcaBruta("", (int) (short) 1, "", (-1));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3074");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 10, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) '#', "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3076");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 100, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3077");
        ds.CasamentoExato.forcaBruta("hi!", (int) (short) 0, "", 1);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3078");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", 1, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3079");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) '4', "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3080");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 0, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3081");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("", 100, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3082");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("", (int) (byte) 100, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3083");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) 'a', "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3084");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) 'a', "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3085");
        ds.CasamentoExato.forcaBruta("hi!", (-1), "", (int) (byte) -1);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3086");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) 10, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3087");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) '4', "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3088");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (short) 0, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3089");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) 'a', "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3090");
        ds.CasamentoExato.forcaBruta("", (int) (short) 0, "hi!", 0);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3091");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (byte) -1, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3092");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 10, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3093");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 100, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3094");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) 'a', "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3095");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 10, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3096");
        ds.CasamentoExato.forcaBruta("hi!", 0, "hi!", (int) (short) 100);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3097");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) ' ', "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3098");
        ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) -1, "hi!", (int) (byte) -1);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3099");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) ' ', "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3100");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) ' ', "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3101");
        ds.CasamentoExato.forcaBruta("hi!", (int) '#', "hi!", (int) (byte) 100);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3102");
        ds.CasamentoExato.bmh("", (int) (short) -1, "", (int) (short) 1);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3103");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", 10, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3104");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) ' ', "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3105");
        ds.CasamentoExato.forcaBruta("hi!", (-1), "hi!", (int) (short) 0);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3106");
        ds.CasamentoExato.forcaBruta("", (int) (short) 10, "", (int) (short) 0);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3107");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 100, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3108");
        ds.CasamentoExato.bmhs("hi!", (int) (byte) -1, "hi!", (int) (short) 0);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3109");
        ds.CasamentoExato.forcaBruta("", (int) ' ', "hi!", (int) '4');
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", 10, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3111");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 100, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3112");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) '4', "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3113");
        ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 0, "hi!", (int) (byte) 10);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3114");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 10, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3115");
        ds.CasamentoExato.forcaBruta("", (-1), "hi!", 0);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3116");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", 100, "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3117");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", 1, "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3118");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", 10, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3119");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (byte) 100, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3120");
        ds.CasamentoExato.forcaBruta("hi!", 1, "", (int) (byte) 10);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3121");
        ds.CasamentoExato.forcaBruta("hi!", (int) (short) 0, "hi!", (int) (byte) -1);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3122");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) '#', "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3123");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 100, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3124");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 0, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3125");
        ds.CasamentoExato.forcaBruta("", (int) (short) 1, "", (int) (short) -1);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3126");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 0, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3127");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 10, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3128");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) (short) 10, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3129");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) 'a', "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3130");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 10, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3131");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", 1, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3132");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", 100, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3133");
        ds.CasamentoExato.shiftAndExato("hi!", (int) (short) 0, "", (int) (short) -1);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3134");
        ds.CasamentoExato.forcaBruta("hi!", (int) (short) 100, "hi!", (int) (byte) -1);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3135");
        ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 100, "hi!", (int) (byte) -1);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3136");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) -1, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3137");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", 100, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3138");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 10, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3139");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) ' ', "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3140");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) ' ', "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3141");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 10, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3142");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) 'a', "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3143");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 100, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) ' ', "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3145");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) '4', "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3146");
        ds.CasamentoExato.shiftAndExato("hi!", (-1), "hi!", (int) (byte) -1);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3147");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 10, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3148");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) -1, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3149");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) 100, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3150");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) (short) 100, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3151");
        ds.CasamentoExato.shiftAndExato("", (int) (byte) -1, "", 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3152");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) ' ', "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3153");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (short) 0, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3154");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 10, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3155");
        ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 1, "", (int) (byte) 10);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3156");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) -1, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) '#', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3158");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) '#', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3159");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 1, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3160");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", 10, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3161");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) 'a', "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3162");
        ds.CasamentoExato.forcaBruta("", (int) (short) 0, "", (int) (byte) 10);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3163");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", 10, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3164");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", 0, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3165");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (-1), "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3166");
        ds.CasamentoExato.forcaBruta("", (int) (byte) 10, "hi!", 100);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3167");
        ds.CasamentoExato.shiftAndExato("hi!", (int) (short) 0, "hi!", (int) (short) 0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3168");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (short) 1, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

