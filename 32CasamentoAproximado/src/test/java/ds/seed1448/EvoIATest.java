package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

    private static final String BASE_STRING = "Casamento na posicao: ";
    private static final String TEST_STRING = "/dR)+gPI";
    private static final int OFFSET_ONE = 1;
    private static final int OFFSET_NEG_ONE = -1;
    private static final int OFFSET_ZERO = 0;

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Happy path test
        String result = CasamentoAproximado.shiftAndAproximado(BASE_STRING, OFFSET_ONE, BASE_STRING, OFFSET_NEG_ONE, OFFSET_ONE);
        assertNotNull("Result should not be null", result);
        assertTrue("Result should contain input string", result.contains(BASE_STRING));
    }



    @Test(timeout = 4000)
    public void test1() throws Throwable {
        String result = CasamentoAproximado.shiftAndAproximado(TEST_STRING, OFFSET_ONE, TEST_STRING, OFFSET_ONE, OFFSET_ZERO);
        assertNotNull("Result should not be null", result);
        assertTrue("Result should contain input string", result.contains(TEST_STRING));
    }



    @Test(timeout = 4000)
    public void test2() throws Throwable {
        CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
        assertNotNull("Instance should not be null", casamentoAproximado0);
    }

}