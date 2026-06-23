package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

  private static final String TEST_STRING0 = "}t-!\"QVB1ekBEvmTP<";
  private static final int TEST_INT0 = 428;
  private static final String TEST_STRING1 = "ds.CasamentoAproximado";
  private static final String TEST_STRING2 = "Casamento na posicao: ";
  private static final int TEST_INT1 = 1;
  private static final int TEST_INT2 = 1970;

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
      CasamentoAproximado.shiftAndAproximado("", 0, "", 0, 0);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch (StringIndexOutOfBoundsException e) {
      assertEquals("String index out of range", e.getMessage());
    } // Added empty strings and zero indices to test boundaries
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    String result = CasamentoAproximado.shiftAndAproximado(TEST_STRING1, TEST_INT1, TEST_STRING2, TEST_INT1, TEST_INT2);
    assertNotNull("Result should not be null", result);
    assertTrue("Result should contain expected substring", result.contains("Casamento"));
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    CasamentoAproximado instance = createInstance();
    assertNotNull("Instance should not be null", instance);
  }

  private CasamentoAproximado createInstance() {
    return new CasamentoAproximado();
  }
}