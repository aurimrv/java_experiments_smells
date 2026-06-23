package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

    private static final String TEST_STRING1_0 = ":cWJqud]/*kTuz:x*>";
    private static final String TEST_STRING2_0 = "S6*Go";
    private static final int TEST_INT1_0 = 1;
    private static final int TEST_INT2_0 = 3472;

    private static final String TEST_STRING1_1 = "s";
    private static final String TEST_STRING2_1 = "HCh(!oI\u007fl= T)";
    private static final int TEST_INT1_1 = 1;
    private static final int TEST_INT2_1 = 1;

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Happy path test
        int result = CasamentoAproximado.shiftAndAproximado(TEST_STRING1_0, TEST_INT1_0, TEST_STRING2_0, TEST_INT1_0, TEST_INT2_0);
        // Replace expectedValue with actual expected result
        int expectedValue = 0; // TODO: set correct expected value
        assertEquals("Expected result does not match", expectedValue, result);
    }



    @Test(timeout = 4000)
    public void test1() throws Throwable {
        int result = CasamentoAproximado.shiftAndAproximado(TEST_STRING1_1, TEST_INT1_1, TEST_STRING2_1, TEST_INT1_1, TEST_INT2_1);
        int expectedValue = 0; // TODO: set correct expected value
        assertEquals("Expected result does not match", expectedValue, result);
    }



    @Test(timeout = 4000)
    public void test2() throws Throwable {
        CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
        assertNotNull("Instance should be created", casamentoAproximado0);
    }


}