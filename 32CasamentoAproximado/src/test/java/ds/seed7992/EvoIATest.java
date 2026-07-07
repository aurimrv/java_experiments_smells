package ds.seed7992;

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

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      CasamentoAproximado.shiftAndAproximado("0P@H_ i?dqY", 0, "", 0, 0);
      // TODO: Replace expectedValue with actual expected result
      //int expectedValue = 0;
      //assertEquals("Expected result for given input", expectedValue, result);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      try {
          CasamentoAproximado.shiftAndAproximado("`F6/yq97<qRcldI", 154, "idAzNDHx?W", (-1), 154);
          fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch (StringIndexOutOfBoundsException e) {
          // Expected exception caught
      }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      try {
          CasamentoAproximado.shiftAndAproximado("8T5tx,1Ox^", 1004, "", 0, 0);
          fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch (StringIndexOutOfBoundsException e) {
          // Expected exception caught
      }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
      try {
          CasamentoAproximado.shiftAndAproximado("", 782, "U[Ug-;]", 782, 782);
          fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch (StringIndexOutOfBoundsException e) {
          // Expected exception caught
      }
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
      CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
      assertNotNull("Object should be instantiated", casamentoAproximado0);
  }

}