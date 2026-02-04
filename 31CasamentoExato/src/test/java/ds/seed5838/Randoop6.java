package ds.seed5838;

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
        ds.CasamentoExato.bmh("hi!", (int) (byte) -1, "", (int) (short) 0);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3002");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 10, "hi!", (int) (short) 10);
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
            ds.CasamentoExato.shiftAndExato("", 1, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.bmhs("", 0, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
            ds.CasamentoExato.shiftAndExato("hi!", 10, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3006");
        ds.CasamentoExato.forcaBruta("hi!", (int) (short) 10, "hi!", 100);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) (short) 10, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (byte) -1, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3009");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) 10, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3010");
        ds.CasamentoExato.forcaBruta("", (int) (byte) -1, "hi!", (int) ' ');
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3011");
        ds.CasamentoExato.forcaBruta("", (int) (byte) -1, "", 0);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", 1, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) '4', "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.bmhs("hi!", (int) ' ', "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3015");
        ds.CasamentoExato.forcaBruta("", (int) (short) 10, "hi!", (int) '#');
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3016");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (short) 0, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3017");
        ds.CasamentoExato.forcaBruta("", (int) (byte) 100, "hi!", (int) (short) -1);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3018");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) ' ', "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3019");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", 10, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
            ds.CasamentoExato.bmh("hi!", 100, "", (int) '4');
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
            ds.CasamentoExato.forcaBruta("", (int) '4', "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3022");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (byte) 10, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (short) 100, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.forcaBruta("", (int) (short) 100, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3025");
        ds.CasamentoExato.forcaBruta("", (int) (byte) -1, "hi!", (int) '#');
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3026");
        ds.CasamentoExato.bmhs("hi!", (-1), "", (int) (short) -1);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) (byte) 100, "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 0, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3029");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (byte) 10, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) 1, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3031");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (short) 0, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.shiftAndExato("hi!", (int) ' ', "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3033");
        ds.CasamentoExato.forcaBruta("", (int) (short) 0, "hi!", (int) (short) 100);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3034");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) ' ', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3035");
        ds.CasamentoExato.forcaBruta("hi!", (int) '#', "hi!", 100);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3036");
        ds.CasamentoExato.forcaBruta("hi!", 1, "hi!", (int) (byte) 1);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3037");
        ds.CasamentoExato.bmh("", (int) (byte) -1, "", (int) (short) 0);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", (int) (short) 10, "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) ' ', "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (short) 100, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3041");
        ds.CasamentoExato.forcaBruta("", (int) (short) 0, "", 0);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3042");
        ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 0, "hi!", (int) 'a');
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3043");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 100, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.shiftAndExato("", (int) (byte) 10, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3045");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("hi!", 10, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3046");
        ds.CasamentoExato.forcaBruta("hi!", (int) (short) 100, "hi!", (int) (short) 0);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3047");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (byte) 100, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.forcaBruta("hi!", (int) (short) 10, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3049");
        ds.CasamentoExato.forcaBruta("", (int) (short) 0, "hi!", (int) (byte) -1);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3050");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 1, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3051");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 0, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.bmhs("hi!", (int) (short) -1, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3053");
        ds.CasamentoExato.forcaBruta("hi!", (-1), "hi!", (int) ' ');
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3054");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", 0, "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.bmh("hi!", (int) ' ', "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.bmhs("", (int) ' ', "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3057");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) ' ', "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3058");
        ds.CasamentoExato.forcaBruta("hi!", 1, "hi!", (-1));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3059");
        ds.CasamentoExato.forcaBruta("", 0, "hi!", (int) (byte) -1);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3060");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) '4', "", (int) ' ');
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
            ds.CasamentoExato.bmh("hi!", (int) ' ', "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
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
            ds.CasamentoExato.bmh("hi!", (int) '4', "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
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
            ds.CasamentoExato.shiftAndExato("hi!", (-1), "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3064");
        ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 0, "", (int) (byte) 0);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3065");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) '#', "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3066");
        ds.CasamentoExato.bmhs("", (int) (short) -1, "hi!", (int) (byte) 0);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3067");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) 10, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3068");
        ds.CasamentoExato.shiftAndExato("", (int) (byte) 0, "hi!", (int) (short) 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3069");
        ds.CasamentoExato.forcaBruta("hi!", 10, "", (int) (byte) -1);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3070");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("hi!", (int) (byte) -1, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.forcaBruta("", 100, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.bmhs("hi!", (int) '4', "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3073");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) '#', "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3074");
        ds.CasamentoExato.shiftAndExato("", (int) (byte) 0, "hi!", (int) (byte) 1);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (short) -1, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3076");
        ds.CasamentoExato.forcaBruta("", (int) (short) 0, "", (int) 'a');
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3077");
        ds.CasamentoExato.bmh("", 0, "hi!", (int) (byte) 1);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3078");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) '4', "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.shiftAndExato("", (int) (byte) 1, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.bmhs("", (int) (byte) -1, "hi!", (int) (byte) 100);
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
            ds.CasamentoExato.bmh("", (int) '4', "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3082");
        ds.CasamentoExato.forcaBruta("hi!", (int) (byte) 0, "", (int) (byte) 1);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3083");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.shiftAndExato("", (int) (byte) 100, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoExato.bmh("hi!", (int) '#', "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3085");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) 100, "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3086");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.forcaBruta("hi!", (int) (short) 100, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.bmhs("hi!", (int) (short) 100, "hi!", (int) '#');
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
            ds.CasamentoExato.bmhs("", (int) 'a', "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoExato.forcaBruta("hi!", (int) '4', "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3090");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmhs("", (int) (short) 1, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3091");
        ds.CasamentoExato.forcaBruta("", (int) (short) 0, "", (int) (short) -1);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3092");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("hi!", (int) (short) 100, "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
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
            ds.CasamentoExato.shiftAndExato("", 100, "hi!", (int) (byte) -1);
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
            ds.CasamentoExato.bmhs("hi!", (int) (short) 10, "hi!", (int) 'a');
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
            ds.CasamentoExato.bmhs("hi!", (int) (short) 1, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoExato.bmh("", (int) (byte) 0, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

