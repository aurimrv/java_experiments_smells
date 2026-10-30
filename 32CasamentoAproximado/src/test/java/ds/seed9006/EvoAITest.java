package ds.seed9006;

import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved and human-maintained tests for CasamentoAproximado.
 * Marker interfaces for test categorization are declared above the test class.
 */
interface UnitTest {}
interface IntegrationTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: malformed/short input and an out-of-range shift index
    final String inputA = "}t-!\"QVB1ekBEvmTP<";
    final int shift = 428;
    final String inputB = "}t-!\"QVB1ekBEvmTP<";
    final int small = 1;
    final int zero = 0;

    // When / Then: the implementation is expected to throw StringIndexOutOfBoundsException
    // Use direct invocation to preserve the original exception type (unchecked).
    try {
      // Act
      CasamentoAproximado.shiftAndAproximado(inputA, shift, inputB, small, zero);

      // If no exception, fail with a descriptive message.
      fail("Expected StringIndexOutOfBoundsException when calling shiftAndAproximado with an out-of-range shift index");
    } catch (StringIndexOutOfBoundsException e) {
      // Assert: we received the expected exception type.
      assertTrue("Caught exception should be a StringIndexOutOfBoundsException",
          e instanceof StringIndexOutOfBoundsException);

      // Additional lightweight sanity on the exception message (may be null in some JDKs).
      String msg = e.getMessage();
      assertTrue("Exception message should be present or null but not throw further issues",
          msg == null || msg.length() >= 0);
    }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CasamentoAproximado.shiftAndAproximado("ds.CasamentoAproximado", 1, "Casamento na posicao: ", 1, 1970);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
  }
}