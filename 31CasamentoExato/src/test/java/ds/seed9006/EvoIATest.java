package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

    private void callBmhs(String text, int pos, String pattern, int offset) {
        CasamentoExato.bmhs(text, pos, pattern, offset);
    }

    private void callBmh(String text, int pos, String pattern, int offset) {
        CasamentoExato.bmh(text, pos, pattern, offset);
    }

    private void callShiftAndExato(String text, int pos, String pattern, int offset) {
        CasamentoExato.shiftAndExato(text, pos, pattern, offset);
    }

    private void callForcaBruta(String text, int pos, String pattern, int offset) {
        CasamentoExato.forcaBruta(text, pos, pattern, offset);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        try {
            callBmhs("ds.CasamentoExato", 127, "'u'", 1);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
       CasamentoExato.bmhs("qoi3I$V", 1, "qoi3I$V", 1);
        // Replace expectedValue with actual expected result
        // assertEquals("Expected result to match", expectedValue, result);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        try {
            callBmh("TYmkx_D>d5m]H;8Kna5", 886, "TYmkx_D>d5m]H;8Kna5", 1);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        try {
            callBmh(null, -1451, "", 0);
            fail("Expected exception due to null input or invalid index");
        } catch (Exception e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        try {
            callBmh("", 4430, "", 1382);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        CasamentoExato.shiftAndExato("SX5d", 1, "MK}7bz<", 0);
        // Replace expectedValue with actual expected result
        // assertEquals("Expected result to match", expectedValue, result);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        CasamentoExato.shiftAndExato("r<sO$C@,U@JL", 1, "r<sO$C@,U@JL", 1);
        // Replace expectedValue with actual expected result
        // assertEquals("Expected result to match", expectedValue, result);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        try {
            callForcaBruta("k:DQ", 252, "k:DQ", 1);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        CasamentoExato.forcaBruta("(I9Z@", 0, "(I9Z@", 0);
        // Replace expectedValue with actual expected result
        // assertEquals("Expected result to match", expectedValue, result);
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        CasamentoExato casamentoExato0 = new CasamentoExato();
        assertNotNull("Object should be instantiated", casamentoExato0);
    }
}