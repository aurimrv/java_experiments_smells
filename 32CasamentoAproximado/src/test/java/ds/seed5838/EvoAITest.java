package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit test category marker for selective execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CasamentoAproximado.shiftAndAproximado(":cWJqud]/*kTuz:x*>", 1, "S6*Go", 1, 3472);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CasamentoAproximado.shiftAndAproximado("s", 1, "HCh(!oIl= T)", 1, 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
  }
}