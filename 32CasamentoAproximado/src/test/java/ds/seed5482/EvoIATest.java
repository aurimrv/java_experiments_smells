package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

    private static final String TEST_STRING_0_1 = "E\"5AqaT<";
    private static final String TEST_STRING_0_2 = "90";
    private static final int TEST_INT_0_1 = 1734;
    private static final int TEST_INT_0_2 = 1;
    private static final int TEST_INT_0_3 = 0;

    private static final String TEST_STRING_1_1 = "#w";
    private static final String TEST_STRING_1_2 = "+:<kp^qhv[";
    private static final int TEST_INT_1_1 = 2832;
    private static final int TEST_INT_1_2 = -2247;
    private static final int TEST_INT_1_3 = 438;

    private static final String EMPTY_STRING = "";
    private static final int ZERO = 0;
    private static final int SOME_INT = 1383;

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        try {
            CasamentoAproximado.shiftAndAproximado(TEST_STRING_0_1, TEST_INT_0_1, TEST_STRING_0_2, TEST_INT_0_2, TEST_INT_0_3);
            fail("Expected StringIndexOutOfBoundsException to be thrown");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
            assertTrue("Exception message should contain 'String index out of range'", e.getMessage().contains("String index out of range"));
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        try {
            CasamentoAproximado.shiftAndAproximado(TEST_STRING_1_1, TEST_INT_1_1, TEST_STRING_1_2, TEST_INT_1_2, TEST_INT_1_3);
            fail("Expected StringIndexOutOfBoundsException to be thrown");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
            assertTrue("Exception message should contain 'String index out of range'", e.getMessage().contains("String index out of range"));
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        String result = CasamentoAproximado.shiftAndAproximado(EMPTY_STRING, ZERO, EMPTY_STRING, ZERO, SOME_INT);
        assertNotNull("Result should not be null", result);
        // Additional assertions verifying expected behavior should be added here
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
        assertNotNull("Instance should not be null", casamentoAproximado0);
    }
}