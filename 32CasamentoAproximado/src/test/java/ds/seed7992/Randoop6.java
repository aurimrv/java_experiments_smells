package ds.seed7992;

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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (short) 1, (int) (byte) 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) '#', (int) (byte) 100);
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) (short) 10, (int) (byte) -1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (-1), (int) (byte) 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3010");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (short) 100, (int) (byte) -1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (byte) 10, (int) '#');
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
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", 0, 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3018");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", 0, (int) (byte) 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", (int) (byte) 100, (int) '#');
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3022");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", 100, (int) (byte) 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3025");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3026");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) (byte) 100, (int) (byte) 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (short) 0, (int) '#');
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) 'a', (int) 'a');
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
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3033");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 0, 10);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3034");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (byte) 100, (int) (short) -1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) '#', (int) (short) 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) (byte) 1, (int) (byte) 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3041");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3042");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3043");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (short) 10, 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3046");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (short) 0, (int) (byte) 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", 10, (int) (short) 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3049");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3050");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3051");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3052");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", 0, 100);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3053");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3054");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3055");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3056");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3057");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3058");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3059");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3060");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3061");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (short) 0, (int) (byte) 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", 1, (int) '4');
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) ' ', (int) (byte) 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3068");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (-1), 100);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3069");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) '4', 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (byte) 10, (int) (byte) 100);
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
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (short) 100, (int) (short) 100);
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3074");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3075");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (short) 0, 0);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3076");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3077");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3078");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", 100, 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", 1, 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3082");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (byte) 0, (int) '#');
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3083");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3084");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) ' ', 100);
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", 0, 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3089");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (short) -1, 10);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3090");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3091");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) (byte) 1, (int) (short) -1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3095");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3097");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3098");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3099");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3101");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3102");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3103");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (short) 10, (int) '#');
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3106");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3107");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3108");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3109");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3110");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 0, (int) '4');
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3111");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", 10, (int) '4');
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
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3113");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3114");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3115");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3116");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) (short) 10, (int) (short) 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3120");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3121");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", 0, (int) 'a');
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3122");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3125");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3126");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) '4', (int) (byte) 10);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) (short) -1, (int) (short) 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) (short) 1, 100);
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
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 100, (int) (byte) 100);
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
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3133");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3135");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3136");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (byte) 10, 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) '#', (int) (short) 100);
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) 'a', 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3141");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "hi!", 0, (int) '4');
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3142");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3143");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", 0, (int) '#');
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) 'a', 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3146");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3147");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (short) 100, (int) (short) 1);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3150");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", 0, 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3151");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3152");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", 1, (int) (short) 0);
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3155");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3156");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (short) 1, 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) '#', (int) 'a');
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3161");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (short) 0, 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3162");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3163");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", 0, 1);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3164");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) '#', (int) '4');
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
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3166");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3167");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3168");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3169");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3170");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3171");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (byte) -1, (int) '#');
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3172");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3173");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3174");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3175");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3176");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3177");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (-1), 10);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3178");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", 0, 1);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3179");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3180");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3181");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3182");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3184");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3185");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3186");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3187");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 0, 10);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3188");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3189");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", (-1), 0);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3190");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3191");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3192");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3193");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3194");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3195");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3196");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3197");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3198");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3199");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3200");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3201");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3202");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3203");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3204");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) (short) 1, (int) '4');
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3205");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3206");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3207");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3208");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3209");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3210");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3211");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3212");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3213");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (-1), 1);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3214");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3215");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3216");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3217");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3218");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3219");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (byte) -1, (int) '4');
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3220");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3221");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3222");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3223");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3224");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3225");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3226");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3227");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3228");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", 0, (int) (short) 10);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3229");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3230");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3231");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3232");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3233");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "hi!", (int) (short) 1, (int) 'a');
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3234");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3235");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3236");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3237");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) (byte) 0, 0);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3238");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3239");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3240");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "hi!", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3241");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3242");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3243");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3244");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3245");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3246");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3247");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3249");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3250");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3251");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3252");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3253");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3254");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3255");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3256");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3257");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 0, 1);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3258");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3259");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3260");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3261");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3262");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3263");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3264");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", (int) (short) 1, 0);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3265");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", 1, (int) '4');
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3266");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3267");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3268");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3269");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3270");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3271");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3272");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3273");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3274");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3275");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3276");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3277");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3278");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3279");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3280");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3281");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3282");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3283");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 1, 100);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3284");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3285");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3286");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3287");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3288");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3289");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3290");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3291");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3292");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3293");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3294");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3296");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3297");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3298");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3299");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3300");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3301");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "hi!", (int) (byte) 1, 100);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3302");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3303");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3304");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3305");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3306");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3307");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3308");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3309");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3310");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3311");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3312");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3313");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3314");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3315");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop6.test3316");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

