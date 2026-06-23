package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

  private static final String TEST_STRING_01 = "Casamento na posicao: ";
  private static final String TEST_STRING_02 = "q<5l)=]b@8Gc7";
  private static final String TEST_STRING_03 = "YQACU10CMLCS~Y[]>$G";
  private static final String TEST_STRING_04 = "KdFIEHl!c";
  private static final String TEST_STRING_05 = "PeLG+DQRi8fb\u007f4liX";
  private static final String TEST_STRING_06 = "!|bst?B;%cM%<";
  private static final String TEST_STRING_07 = "KD}n;wa";
  private static final String TEST_STRING_08 = "|WC<u;Lm;r d";
  private static final String TEST_STRING_09 = "5";
  private static final String EMPTY_STRING = "";
  private static final String TEST_STRING_10 = "e,mFj6[^5h(plF";
  private static final String TEST_STRING_11 = " E4]pn";
  private static final String TEST_STRING_12 = ")CA1[@zC=]\"]$}>@:v";
  private static final String TEST_STRING_13 = "ozIrEd`hcyf";

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      assertThrows(StringIndexOutOfBoundsException.class, () -> {
          CasamentoExato.bmhs(EMPTY_STRING, 0, EMPTY_STRING, -1);
      });
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CasamentoExato.bmhs(TEST_STRING_01, 1, TEST_STRING_01, 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasamentoExato.bmhs(TEST_STRING_02, 1, TEST_STRING_03, 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      assertThrows(StringIndexOutOfBoundsException.class, () -> {
          CasamentoExato.bmh(TEST_STRING_04, 1200, TEST_STRING_05, 1);
      });
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CasamentoExato.bmh(TEST_STRING_13, 1, TEST_STRING_13, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      assertThrows(StringIndexOutOfBoundsException.class, () -> {
          CasamentoExato.bmh(TEST_STRING_06, 583, EMPTY_STRING, 583);
      });
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      assertThrows(StringIndexOutOfBoundsException.class, () -> {
          CasamentoExato.shiftAndExato(TEST_STRING_07, 696, TEST_STRING_08, 0);
      });
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasamentoExato.shiftAndExato(TEST_STRING_09, 1, TEST_STRING_09, 1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CasamentoExato.forcaBruta(EMPTY_STRING, 2134, EMPTY_STRING, 0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      assertThrows(StringIndexOutOfBoundsException.class, () -> {
          CasamentoExato.forcaBruta(TEST_STRING_10, 2583, TEST_STRING_10, 1250);
      });
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato.forcaBruta(TEST_STRING_11, 2216, TEST_STRING_12, 2216);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}