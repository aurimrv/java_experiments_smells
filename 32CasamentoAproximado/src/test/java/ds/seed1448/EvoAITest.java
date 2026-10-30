package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Marker category for selective test execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CasamentoAproximado.shiftAndAproximado("Casamento na posicao: ", 1, "Casamento na posicao: ", (-1), 1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CasamentoAproximado.shiftAndAproximado("/dR)+gPI", 1, "/dR)+gPI", 1, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
  }
}