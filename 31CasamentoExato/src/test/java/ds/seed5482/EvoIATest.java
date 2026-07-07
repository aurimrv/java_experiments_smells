package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

  private void expectStringIndexOutOfBoundsExceptionForBmhs(String text, int pos, String pattern, int patPos) {
    try {
      CasamentoExato.bmhs(text, pos, pattern, patPos);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch(StringIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  private void expectStringIndexOutOfBoundsExceptionForBmh(String text, int pos, String pattern, int patPos) {
    try {
      CasamentoExato.bmh(text, pos, pattern, patPos);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch(StringIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  private void expectStringIndexOutOfBoundsExceptionForShiftAndExato(String text, int pos, String pattern, int patPos) {
    try {
      CasamentoExato.shiftAndExato(text, pos, pattern, patPos);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch(StringIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  private static final String TEST_STRING_BMHS = "L=y(bQ3<R.zW";
  private static final String TEST_STRING_BMH = ";kpcTap[oNf2";
  private static final String TEST_STRING_BMH_ALT = "KDX8]d";
  private static final String TEST_STRING_SHIFT = "/Cpp\u007f</";
  private static final String TEST_STRING_FORCA1 = "7\u007f!0vT{<atu'MM{`b5";
  private static final String TEST_STRING_FORCA2 = "\u007fOIr32NNn}/J+%e";
  private static final String TEST_STRING_FORCA3 = "4Plc";

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    expectStringIndexOutOfBoundsExceptionForBmhs("", 0, "", 0);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    CasamentoExato.bmhs(TEST_STRING_BMHS, 1, TEST_STRING_BMHS, 1);
    //assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    CasamentoExato.bmh(TEST_STRING_BMH, 1, "Casamento na posicao: ", 1);
    //assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    CasamentoExato.bmh(TEST_STRING_BMH_ALT, 1, TEST_STRING_BMH_ALT, 1);
    //assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    expectStringIndexOutOfBoundsExceptionForBmh("", 0, "", 0);
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
    expectStringIndexOutOfBoundsExceptionForShiftAndExato("", 0, "", 0);
  }

  @Test(timeout = 4000)
  public void test6() throws Throwable {
    CasamentoExato.shiftAndExato(TEST_STRING_SHIFT, 1, TEST_STRING_SHIFT, 1);
    //assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test7() throws Throwable {
    CasamentoExato.forcaBruta(TEST_STRING_FORCA1, 1, TEST_STRING_FORCA1, 1);
    //assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test8() throws Throwable {
    CasamentoExato.forcaBruta(TEST_STRING_FORCA2, 1645, TEST_STRING_FORCA3, 1645);
    //assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test9() throws Throwable {
    CasamentoExato casamentoExato0 = new CasamentoExato();
    assertNotNull("Object should be instantiated", casamentoExato0);
  }
}