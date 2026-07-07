package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

  private void expectStringIndexOutOfBoundsExceptionBmhs(String text, int pos, String pattern, int patPos) {
    try {
      CasamentoExato.bmhs(text, pos, pattern, patPos);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch(StringIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  private void callBmhs(String text, int pos, String pattern, int patPos) {
    CasamentoExato.bmhs(text, pos, pattern, patPos);
    //assertNotNull("Result should not be null", result);
  }

  private void callBmh(String text, int pos, String pattern, int patPos) {
    CasamentoExato.bmh(text, pos, pattern, patPos);
    //assertNotNull("Result should not be null", result);
  }

  private void callShiftAndExato(String text, int pos, String pattern, int patPos) {
    CasamentoExato.shiftAndExato(text, pos, pattern, patPos);
    //assertNotNull("Result should not be null", result);
  }

  private void expectStringIndexOutOfBoundsExceptionForcaBruta(String text, int pos, String pattern, int patPos) {
    try {
      CasamentoExato.forcaBruta(text, pos, pattern, patPos);
      fail("Expecting exception: StringIndexOutOfBoundsException");
    } catch(StringIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  private void callForcaBruta(String text, int pos, String pattern, int patPos) {
    CasamentoExato.forcaBruta(text, pos, pattern, patPos);
    //assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    expectStringIndexOutOfBoundsExceptionBmhs("", 0, "", 0);
  }

  @Test(timeout = 4000)
  public void test01() throws Throwable {
    callBmhs("i", 1, "i", 1);
  }

  @Test(timeout = 4000)
  public void test02() throws Throwable {
    callBmhs("Casamento na posicao: ", 1, "PsN%thM.{$8p8aX", 1);
  }

  @Test(timeout = 4000)
  public void test03() throws Throwable {
    callBmh("[Xe*", 1, "B ", 1);
  }

  @Test(timeout = 4000)
  public void test04() throws Throwable {
    callBmh("FFrTJ)k", 1, "FFrTJ)k", 1);
  }

  @Test(timeout = 4000)
  public void test05() throws Throwable {
    callBmh(",%>[P\"{wKXi'\"rjmb.2", -134, ",%>[P\"{wKXi'\"rjmb.2", 7);
  }

  @Test(timeout = 4000)
  public void test06() throws Throwable {
    callShiftAndExato("xxNkW].~IztaRTE", 7, "xxNkW].~IztaRTE", 7);
  }

  @Test(timeout = 4000)
  public void test07() throws Throwable {
    expectStringIndexOutOfBoundsExceptionForcaBruta("", 0, "", 0);
  }

  @Test(timeout = 4000)
  public void test08() throws Throwable {
    callForcaBruta("MUW5U0T%A|cq0m", 3735, "Z[la^", 3735);
  }

  @Test(timeout = 4000)
  public void test09() throws Throwable {
    callForcaBruta("^cS8=.fV{", 1, "", 0);
  }

  @Test(timeout = 4000)
  public void test10() throws Throwable {
    CasamentoExato casamentoExato0 = new CasamentoExato();
    assertNotNull("Object should be instantiated", casamentoExato0);
  }
}