package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3501");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3502");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3503");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3504");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3505");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3506");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3507");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3508");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3509");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3510");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3511");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 1, 10);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3512");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3513");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3514");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3515");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3516");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3517");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3518");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (short) -1, (int) '4');
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3519");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3520");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3521");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3522");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3523");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3524");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3525");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3526");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3527");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3528");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", 0, (int) (short) 100);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3529");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", 1, (int) (byte) 0);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3530");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3531");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3532");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3533");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 0, (int) (short) 1);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3534");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3535");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3536");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3537");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3538");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3539");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3540");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3541");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3542");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", 0, (int) (byte) 0);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3543");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3544");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3545");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3546");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3547");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3548");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3549");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", 0, (int) (byte) 1);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3550");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 1, (int) (short) 1);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3551");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3552");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3553");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3554");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3555");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3556");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3557");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3558");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3559");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3560");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3561");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3562");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (byte) 1, 0);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3563");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (-1), (int) (short) 10);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3564");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", 0, (int) (short) 10);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3565");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3566");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3567");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (byte) 0, 0);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3568");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3569");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3570");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3571");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3572");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3573");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3574");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3575");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3576");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (short) -1, 0);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3577");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3578");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3579");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3580");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3581");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3582");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3583");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3584");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", 0, 10);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3585");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3586");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3587");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3588");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3589");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3590");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3591");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3592");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3593");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3594");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3595");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3596");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3597");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (-1), 100);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3598");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3599");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3600");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3601");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3602");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3603");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3604");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3605");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3606");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3607");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3608");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3609");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", 0, (int) (byte) 0);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3610");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (-1), 100);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3611");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3612");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "hi!", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3613");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3614");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3615");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3616");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3617");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3618");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3619");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3620");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "hi!", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3621");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3622");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", 0, (int) (short) 0);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3623");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3624");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3625");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3626");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3627");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (-1), "", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3628");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3629");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3630");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 0, (int) (short) 10);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3631");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3632");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "hi!", 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3633");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3634");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3635");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3636");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3637");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3638");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3639");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3640");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3641");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3642");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3643");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 0, (int) '4');
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3644");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3645");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3646");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3647");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3648");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3649");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3650");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3651");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3652");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3653");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3654");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3655");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", 0, (int) (short) 1);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3656");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "hi!", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3657");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3658");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3659");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3660");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3661");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3662");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3663");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3664");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3665");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", 0, (int) (byte) 10);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3666");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3667");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3668");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3669");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3670");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3671");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", 1, (int) (short) 100);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3672");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3673");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3674");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3675");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3676");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3677");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3678");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3679");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3680");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 100, "hi!", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3681");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3682");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (short) 0, 1);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3683");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3684");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "hi!", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3685");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (short) -1, 1);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3686");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3687");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3688");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3689");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3690");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3691");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3692");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3693");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3694");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3695");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3696");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3697");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3698");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3699");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3700");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3701");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3702");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3703");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3704");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3705");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3706");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3707");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3708");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3709");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3710");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3711");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3712");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3713");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 1, "", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3714");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "hi!", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3715");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3716");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "hi!", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3717");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3718");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3719");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3720");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3721");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "", (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3722");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 1, "hi!", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3723");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "hi!", (int) (short) 1, (int) '4');
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3724");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3725");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3726");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3727");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "hi!", (-1), (int) ' ');
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3728");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (-1), "", (int) (short) -1, (int) ' ');
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3729");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3730");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3731");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3732");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", 0, (int) '4');
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3733");
        ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (-1), (int) (short) 100);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3734");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3735");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3736");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 1, "", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3737");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3738");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3739");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3740");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3741");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3742");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3743");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3744");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3745");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3746");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3747");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3748");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3749");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3750");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3751");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3752");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 1, (int) '#');
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3753");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3754");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3755");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "hi!", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3756");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", 0, (int) ' ');
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3757");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", 1, 100);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3758");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '#', "hi!", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3759");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3760");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3761");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3762");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 100, "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3763");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3764");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3765");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "hi!", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3766");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3767");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "", 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3768");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) 'a', "", (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3769");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3770");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3771");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3772");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 100, "", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3773");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "hi!", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3774");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 10, "", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3775");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", 0, (int) (short) 10);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3776");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "hi!", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3777");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 1, "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3778");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "hi!", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3779");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) ' ', "hi!", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3780");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3781");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3782");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3783");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 100, "", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3784");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3785");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 10, "hi!", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3786");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3787");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3788");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) 'a', "", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3789");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3790");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3791");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3792");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3793");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 10, "hi!", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3794");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) -1, "hi!", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3795");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '4', "hi!", 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3796");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "hi!", (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3797");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 100, "hi!", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3798");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "hi!", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3799");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (int) (byte) -1, 10);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3800");
        ds.CasamentoAproximado.shiftAndAproximado("", (-1), "hi!", 0, 1);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3801");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 10, "", (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3802");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) -1, "hi!", (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3803");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3804");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", (int) (short) 1, (int) ' ');
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3805");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 0, "", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3806");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 0, "hi!", 1, (int) '#');
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3807");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "", (-1), (int) (byte) 100);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3808");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) -1, "", (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3809");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) ' ', "hi!", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3810");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 0, "hi!", 1, (int) (byte) 10);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3811");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) '#', "", (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3812");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 10, "", (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3813");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", 0, "", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3814");
        ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 0, "hi!", 0, 0);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3815");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (short) 10, "", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3816");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (short) 1, "hi!", (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3817");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) 1, "", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3818");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) '4', "", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3819");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("hi!", (int) (byte) 100, "hi!", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3820");
        // The following exception was thrown during execution in test generation
        try {
            ds.CasamentoAproximado.shiftAndAproximado("", (int) (byte) -1, "hi!", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop7.test3821");
        ds.CasamentoAproximado.shiftAndAproximado("hi!", 0, "hi!", (int) (short) 0, (int) (byte) 10);
    }
}

