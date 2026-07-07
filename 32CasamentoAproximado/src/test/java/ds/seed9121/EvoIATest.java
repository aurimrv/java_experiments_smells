package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoAproximado_ESTest_scaffolding {

  private void callShiftAndAproximado(String s1, int i1, String s2, int i2, int i3) {
    CasamentoAproximado.shiftAndAproximado(s1, i1, s2, i2, i3);
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
      callShiftAndAproximado("M.1)Pfq8yvfj", 2253, "M.1)Pfq8yvfj", 0, 0);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch (StringIndexOutOfBoundsException e) {
      assertEquals("String index out of range: 2253", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    CasamentoAproximado.shiftAndAproximado("^Y8}82_a(TT63:j^", 0, "gV:>K5", 0, 0);
    //assertTrue("Result should be non-negative", result >= 0);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
      callShiftAndAproximado("", 1335, "", 2451, 2451);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch (StringIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
      callShiftAndAproximado("B+fhV<w@z+)YC,@w)", 1191, "B+fhV<w@z+)YC,@w)", (-1), 1191);
      fail("Expecting exception for negative index");
    } catch (StringIndexOutOfBoundsException e) {
      assertTrue("Exception message should contain 'index'", e.getMessage().contains("index"));
    }
  }

  private CasamentoAproximado createCasamentoAproximado() {
    return new CasamentoAproximado();
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    CasamentoAproximado obj = createCasamentoAproximado();
    assertNotNull("Object should be created", obj);
  }

}