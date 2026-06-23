package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

    private static final String TEST_STRING_0 = ";{";
    private static final int TEST_INT_0 = 1;
    private static final String TEST_STRING_1 = "Casamento na posicao: ";
    private static final int TEST_INT_1 = 1;

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        int result = CasamentoAproximado.shiftAndAproximado(TEST_STRING_0, TEST_INT_0, TEST_STRING_0, TEST_INT_0, 0);
        assertEquals("Expected result for matching strings", 0, result);
    }



    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        int result = CasamentoAproximado.shiftAndAproximado(TEST_STRING_1, TEST_INT_1, TEST_STRING_1, TEST_INT_1, 1);
        assertEquals("Expected result for matching strings", 1, result);
    }



    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
        assertNotNull("Object should be instantiated", casamentoAproximado0);
    }


}