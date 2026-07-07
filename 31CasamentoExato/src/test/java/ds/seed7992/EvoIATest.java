package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
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
    public void test0()  throws Throwable  {
        try { 
            callBmhs("r</7,'(1?ozFe8", 1626, ")oGy!B+')V", 1);
            fail("Expected StringIndexOutOfBoundsException to be thrown");
        } catch(StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        CasamentoExato.bmhs("`", 1, "`", 1);
        //assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        CasamentoExato.bmh("C6 {", 4, "C6 {", 1);
        //assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        try { 
            callBmh("`", 256, "", 256);
            fail("Expected StringIndexOutOfBoundsException to be thrown");
        } catch(StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        try { 
            callShiftAndExato("zU<M&v\"JJ", 2794, "zU<M&v\"JJ", 1);
            fail("Expected StringIndexOutOfBoundsException to be thrown");
        } catch(StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        CasamentoExato.shiftAndExato("`", 1, "#0Lts%~RZI8t~j`$;", 1);
        //assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        CasamentoExato.forcaBruta("a", 256, "foqu:$yL6{tu\"9&M", 256);
        //assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        try { 
            callForcaBruta("nlq4hZPi", 2505, "nlq4hZPi", 2505);
            fail("Expected StringIndexOutOfBoundsException to be thrown");
        } catch(StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        CasamentoExato.forcaBruta(null, 0, null, 0);
        //assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test9()  throws Throwable  {
        CasamentoExato instance = new CasamentoExato();
        assertNotNull("Instance should not be null", instance);
    }
}