package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

    private static final String TEST_STRING_30PU = "30PU$ ?.0c8mwc<*0u";
    private static final String TEST_PATTERN_GBQ = " gbQGSU%b?_AdovHyLT";
    private static final String TEST_TEXT_CZ = ""$$_CZ]7w5Q8Rb";
    private static final String TEST_STRING_OB = "OB  @1;#DiG,`c,D";
    private static final String TEST_PATTERN_Q = "{q";
    private static final String TEST_STRING_ONC = "OnC0pD99";
    private static final String TEST_PATTERN_DS = "ds.CasamentoExato";
    private static final String TEST_TEXT_1E = "1e*O";
    private static final String TEST_TEXT_QPB = "Qpb*d(Mv#&!s";
    private static final String TEST_PATTERN_TWA = "tWa/yRkUW?s:?u``~|";
    private static final String TEST_TEXT_GOV = "GoQVvn$8<r";

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        try {
            CasamentoExato.bmhs(TEST_STRING_30PU, 225, TEST_STRING_30PU, 1);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        String result = CasamentoExato.bmhs(TEST_STRING_30PU, 1, TEST_STRING_30PU, 1);
        assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        String result = CasamentoExato.bmh(TEST_PATTERN_GBQ, 1, TEST_TEXT_CZ, 1);
        assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        String result = CasamentoExato.bmh(TEST_STRING_OB, 1, TEST_STRING_OB, 1);
        assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        try {
            CasamentoExato.bmh(TEST_STRING_30PU, 0, TEST_STRING_30PU, 370);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        try {
            CasamentoExato.shiftAndExato(TEST_PATTERN_Q, 190, "", 0);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        String result = CasamentoExato.shiftAndExato(TEST_STRING_ONC, 1, TEST_STRING_ONC, 1);
        assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        String result = CasamentoExato.forcaBruta(TEST_PATTERN_DS, 0, TEST_TEXT_1E, 0);
        assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        try {
            CasamentoExato.forcaBruta(TEST_PATTERN_DS, 818, TEST_PATTERN_DS, 818);
            fail("Expected StringIndexOutOfBoundsException due to invalid index");
        } catch (StringIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        String result = CasamentoExato.forcaBruta(null, 0, TEST_TEXT_QPB, 0);
        assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        String result = CasamentoExato.forcaBruta(TEST_PATTERN_TWA, 1, TEST_TEXT_GOV, 1);
        assertNotNull("Result should not be null", result);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        CasamentoExato casamentoExato0 = new CasamentoExato();
        assertNotNull("Object should be instantiated", casamentoExato0);
    }
}