package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

    private static final String TEST_STRING_0 = "yUj$3Q\u007fx|!w3coF'r";
    private static final String TEST_STRING_1 = "GI";
    private static final int TEST_INT_0 = 2114;
    private static final int TEST_INT_1 = 0;

    private static final String TEST_STRING_2 = "{Xfd)og";
    private static final String TEST_STRING_3 = "ds.CasamentoAproximado";
    private static final int TEST_INT_2 = -360;
    private static final int TEST_INT_3 = 1;

    private static final String TEST_STRING_4 = "xN]dC46M.<0r|YCp{";
    private static final String TEST_STRING_5 = "Y=T]*. GeLXHq}GI";

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        CasamentoAproximado.shiftAndAproximado(TEST_STRING_0, TEST_INT_0, TEST_STRING_1, TEST_INT_1, TEST_INT_0);
        //assertNotNull("Result should not be null", result);
        //assertTrue("Result should contain expected substring", result.contains(TEST_STRING_1));
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        CasamentoAproximado.shiftAndAproximado(TEST_STRING_2, 0, TEST_STRING_3, TEST_INT_2, TEST_INT_3);
        //assertNotNull("Result should not be null", result);
        //assertTrue("Result should contain expected substring", result.contains(TEST_STRING_3));
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        CasamentoAproximado.shiftAndAproximado(TEST_STRING_4, 1, TEST_STRING_5, 1, 0);
        //assertNotNull("Result should not be null", result);
        //assertTrue("Result should contain expected substring", result.contains("GeLXHq"));
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
        assertNotNull("Object should be instantiated", casamentoAproximado0);
    }
}