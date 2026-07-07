package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

    private static final String TEST_PATTERN_0 = "?X\"zqbXoZY5JcI@lt";
    private static final String TEST_MESSAGE = "Casamento na posicao: ";

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        CasamentoAproximado.shiftAndAproximado(TEST_PATTERN_0, 1, TEST_MESSAGE, 1, 0);
        //assertNotNull("Result should not be null", result);
        //assertTrue("Result should contain expected substring", result.contains("Casamento"));
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        CasamentoAproximado.shiftAndAproximado(TEST_MESSAGE, 1, TEST_MESSAGE, 0, 256);
        //assertNotNull("Result should not be null", result);
        //assertTrue("Result should contain expected substring", result.contains("Casamento"));
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        CasamentoAproximado instance = createCasamentoAproximado();
        assertNotNull("Instance should be created", instance);
    }

    private CasamentoAproximado createCasamentoAproximado() {
        return new CasamentoAproximado();
    }
}