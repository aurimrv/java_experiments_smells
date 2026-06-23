package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

  private void expectStringIndexOutOfBounds(Runnable r) {
    try {
      r.run();
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch(StringIndexOutOfBoundsException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    expectStringIndexOutOfBounds(() -> CasamentoExato.bmhs("JIqJFkeFu%NTT8", 256, "JIqJFkeFu%NTT8", 1));
  }

  private static final String TEST_PATTERN_01 = "]A0";
  private static final String TEST_TEXT_01 = "Casamento na posicao: ";
  private static final int TEST_INDEX_01 = 1;

  @Test(timeout = 4000)
  public void test01() throws Throwable {
    int result = CasamentoExato.bmhs(TEST_PATTERN_01, TEST_INDEX_01, TEST_TEXT_01, TEST_INDEX_01);
    assertTrue("Result should be non-negative", result >= 0);
  }

  private static final String TEST_PATTERN_02 = "Casamento na posicao: ";
  private static final String TEST_TEXT_02 = "m5O|4wu";
  private static final int TEST_INDEX_02 = 1;

  @Test(timeout = 4000)
  public void test02() throws Throwable {
    int result = CasamentoExato.bmh(TEST_PATTERN_02, TEST_INDEX_02, TEST_TEXT_02, TEST_INDEX_02);
    assertTrue("Result should be non-negative", result >= 0);
  }

  private static final String TEST_PATTERN_03 = "i116YN";
  private static final int TEST_INDEX_03 = 1;

  @Test(timeout = 4000)
  public void test03() throws Throwable {
    int result = CasamentoExato.bmh(TEST_PATTERN_03, TEST_INDEX_03, TEST_PATTERN_03, TEST_INDEX_03);
    assertTrue("Result should be non-negative", result >= 0);
  }

  @Test(timeout = 4000)
  public void test04() throws Throwable {
    expectStringIndexOutOfBounds(() -> CasamentoExato.bmh("I=\";9M{,gOBp a4V#&", -856, "", 3672));
  }

  @Test(timeout = 4000)
  public void test05() throws Throwable {
    expectStringIndexOutOfBounds(() -> CasamentoExato.shiftAndExato("V) o#u/4qDc_.K", 1653, "i't#aCU ,v", -1));
  }

  private static final String TEST_PATTERN_06 = "x.~ZJ8s'vOp";
  private static final int TEST_INDEX_06 = 1;

  @Test(timeout = 4000)
  public void test06() throws Throwable {
    int result = CasamentoExato.shiftAndExato(TEST_PATTERN_06, TEST_INDEX_06, TEST_PATTERN_06, TEST_INDEX_06);
    assertTrue("Result should be non-negative", result >= 0);
  }

  private static final String TEST_PATTERN_07 = "<w:AV$r;AFk<0";
  private static final String TEST_TEXT_07 = "i4e55_m(vwF";
  private static final int TEST_INDEX_07 = 0;

  @Test(timeout = 4000)
  public void test07() throws Throwable {
    int result = CasamentoExato.forcaBruta(TEST_PATTERN_07, TEST_INDEX_07, TEST_TEXT_07, TEST_INDEX_07);
    assertTrue("Result should be non-negative", result >= 0);
  }

  @Test(timeout = 4000)
  public void test08() throws Throwable {
    expectStringIndexOutOfBounds(() -> CasamentoExato.forcaBruta("Ln", 3554, "Ln", 383));
  }

  private static final String TEST_PATTERN_09 = "i4e55_m(vwF";
  private static final String TEST_TEXT_09 = "<w:AV$r;AFk<0";
  private static final int TEST_INDEX_09 = 6979;

  @Test(timeout = 4000)
  public void test09() throws Throwable {
    int result = CasamentoExato.forcaBruta(TEST_PATTERN_09, TEST_INDEX_09, TEST_TEXT_09, TEST_INDEX_09);
    assertTrue("Result should be non-negative", result >= 0);
  }

  @Test(timeout = 4000)
  public void test10() throws Throwable {
    CasamentoExato casamentoExato0 = new CasamentoExato();
    assertNotNull("Object should be instantiated", casamentoExato0);
  }

}