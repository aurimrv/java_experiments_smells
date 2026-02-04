package ds.seed9006;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2501");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2502");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "hi!", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2504");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2505");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2506");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2507");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2508");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2509");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2510");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2511");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2512");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", 1, (int) (byte) 100);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2513");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2514");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2515");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (short) -1, 1);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2516");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2517");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2518");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2519");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2520");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2521");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2522");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2523");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2524");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2525");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2526");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2527");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2528");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2529");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 0, 100);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2530");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2531");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2532");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2533");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2534");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2535");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2536");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2537");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2538");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2539");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2540");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2541");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2542");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2544");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2545");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2546");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2547");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2548");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2549");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", 0, 100);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2550");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2551");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "hi!", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2552");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2553");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2554");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2555");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2556");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2557");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2558");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2559");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2560");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2561");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2562");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2563");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 0, 100);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2564");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2565");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2566");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2567");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2568");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2569");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2570");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2571");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2572");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2573");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2574");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2575");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 1, (int) (short) 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2576");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2577");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2578");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2579");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2580");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2581");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", 0, (int) 'a');
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2582");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2583");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2584");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2585");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2586");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2587");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2588");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2589");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2590");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2591");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2592");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2593");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2594");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2595");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2596");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2597");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2598");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2599");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2600");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2601");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2602");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2603");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2604");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2605");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2606");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2607");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2608");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2609");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2610");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2611");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 0, (int) (byte) 10);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2612");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2613");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2614");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2615");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 0, 1);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2616");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2617");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2618");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2619");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2620");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", 0, 0);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2621");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2622");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2623");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2624");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2625");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2626");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2627");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (-1), (int) (byte) 0);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2628");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2629");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2630");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2631");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2632");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2633");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2634");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2635");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2636");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2637");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2638");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2639");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2640");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2641");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2642");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2643");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2644");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2645");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2646");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2647");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2648");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2649");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2650");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2651");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2652");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2653");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2654");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2655");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2656");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2657");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2658");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2659");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", 0, (int) '4');
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2660");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2661");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2662");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2663");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2664");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2665");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2666");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2667");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2668");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2669");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2670");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2671");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2672");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2673");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2674");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2675");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2676");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", (int) (short) 0, (int) 'a');
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2677");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2678");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2679");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "hi!", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2680");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2681");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2682");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2683");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2684");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2685");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2686");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2687");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2688");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2689");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2690");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2691");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2692");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2693");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2694");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2695");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2696");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2697");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2698");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2699");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2700");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2701");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2702");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2703");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2704");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2705");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2706");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2707");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2708");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2709");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2710");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2711");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", 0, (int) (byte) 1);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2712");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2713");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2714");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2715");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2716");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2717");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2718");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2719");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2720");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2721");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (-1), (int) (short) 1);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2722");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2723");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2724");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2725");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2726");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2727");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2728");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2729");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2730");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2731");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2732");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2733");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2734");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2735");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2736");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2737");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2738");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2739");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2740");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2741");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) (short) -1, (int) ' ');
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2742");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2743");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2744");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2745");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2746");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", (int) (byte) 0, 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2747");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2748");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2749");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2750");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2751");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2752");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2753");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2754");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2755");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2756");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2757");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2758");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2759");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", 1, (int) (short) 0);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2760");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2761");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2762");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2763");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (-1), 0);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2764");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2765");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", 0, (int) (byte) 1);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2766");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2767");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2768");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", 0, (int) 'a');
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2769");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2770");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 1, (int) (short) 10);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2771");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2772");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", 0, 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2773");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) -1, 1);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2774");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2775");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2776");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2777");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2778");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2779");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2780");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2781");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2782");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2783");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2784");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2785");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2786");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2787");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2788");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2789");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2790");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2791");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", 1, 100);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2792");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2793");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2794");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (short) 0, 100);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2795");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2796");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2797");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2798");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2799");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2800");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2801");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2802");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2803");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (short) -1, (int) 'a');
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2804");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2805");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2806");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2807");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2808");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2809");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2810");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2811");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2812");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "hi!", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2813");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2814");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2815");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2816");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2817");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2818");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2819");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2820");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2821");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2822");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2823");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2824");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2825");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2826");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2827");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2828");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2829");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2830");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2831");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2832");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2833");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2834");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2835");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2836");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", 0, 0);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2837");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2838");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2839");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2840");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2841");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2842");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2843");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2844");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2845");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2846");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2847");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2848");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2849");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (-1), 100);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2850");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2851");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2852");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2853");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2854");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", 0, (int) (byte) 0);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2855");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2856");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2857");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2858");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2859");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2860");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2861");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2862");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2863");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2864");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2865");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2866");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2867");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2868");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2869");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2870");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2871");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2872");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2873");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2874");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2875");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2876");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2877");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2878");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2879");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2880");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2881");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2882");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2883");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2884");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2885");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2886");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2887");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2888");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2889");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2890");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) 0, 1);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2891");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2892");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2893");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2894");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2895");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2896");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2897");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2898");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2899");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2900");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2901");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2902");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2903");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (byte) 1, 0);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2904");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "hi!", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2905");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (byte) -1, 0);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2906");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2907");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (short) -1, 0);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2908");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (-1), (int) (short) 0);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2909");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2910");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2911");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2912");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2913");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) (byte) -1, 100);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2914");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) (byte) 0, 100);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2915");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2916");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2917");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2918");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (short) -1, (int) ' ');
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2919");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2920");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2921");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2922");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "hi!", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2923");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2924");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2925");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2926");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2927");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2928");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2929");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2930");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2931");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2932");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2933");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2934");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2935");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2936");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2937");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2938");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2939");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2940");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2941");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2942");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2943");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2944");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2945");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2946");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2947");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2948");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2949");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2950");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2951");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2952");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2953");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2954");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2955");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2956");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2957");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2958");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2959");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2960");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2961");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2962");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "", (int) (short) -1, (int) '4');
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2963");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2964");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2965");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2966");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2967");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2968");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2969");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2970");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2971");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2972");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2973");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2974");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2975");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2976");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2977");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2978");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2979");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2980");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2981");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2982");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2983");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2984");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2985");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2986");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2987");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "hi!", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2988");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2989");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2990");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (short) 0, 10);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2991");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2992");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2993");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2994");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2995");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2996");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2997");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2998");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2999");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test3000");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

