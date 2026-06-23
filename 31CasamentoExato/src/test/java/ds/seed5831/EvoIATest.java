package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends CasamentoExato_ESTest_scaffolding {

  private void callBmhsWithNulls() {
      CasamentoExato.bmhs(null, 0, null, -1);
  }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try {
          callBmhsWithNulls();
          fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
          verifyException("ds.CasamentoExato", e);
      }
  }

  private void callBmhsWithSampleData() {
      CasamentoExato.bmhs("O;;%iN}B+p;;", 1, "j>y`+<;", 1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String result = CasamentoExato.bmhs("O;;%iN}B+p;;", 1, "j>y`+<;", 1);
      assertNotNull("Result should not be null", result);
  }

  private void callBmhsWithRepeatedStrings() {
      CasamentoExato.bmhs(":3`mFu7EiR", 1, ":3`mFu7EiR", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String result = CasamentoExato.bmhs(":3`mFu7EiR", 1, ":3`mFu7EiR", 1);
      assertNotNull("Result should not be null", result);
  }

  private void callBmhWithSampleData() {
      CasamentoExato.bmh("d=DqwuF", 1, "|R$~R6ZN", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String result = CasamentoExato.bmh("d=DqwuF", 1, "|R$~R6ZN", 1);
      assertNotNull("Result should not be null", result);
  }

  private void callBmhWithClassNameStrings() {
      CasamentoExato.bmh("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String result = CasamentoExato.bmh("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
      assertNotNull("Result should not be null", result);
  }

  private void callBmhWithNullAndLargeIndex() {
      CasamentoExato.bmh(null, 156, "bF!x7", 156);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try {
          callBmhWithNullAndLargeIndex();
          fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  private void callShiftAndExatoWithSampleData() {
      CasamentoExato.shiftAndExato("el,,LT$!wJ<SQ$o ", 1, "3<Mu", 1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String result = CasamentoExato.shiftAndExato("el,,LT$!wJ<SQ$o ", 1, "3<Mu", 1);
      assertNotNull("Result should not be null", result);
  }

  private void callShiftAndExatoWithClassNameStrings() {
      CasamentoExato.shiftAndExato("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String result = CasamentoExato.shiftAndExato("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
      assertNotNull("Result should not be null", result);
  }

  private void callForcaBrutaWithLargeIndex() {
      CasamentoExato.forcaBruta("ds.CasamentoExato", 837, "ds.CasamentoExato", 837);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try {
          callForcaBrutaWithLargeIndex();
          fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  private void callForcaBrutaWithSampleData() {
      CasamentoExato.forcaBruta("jsuU|`2!0#", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String result = CasamentoExato.forcaBruta("jsuU|`2!0#", 1, "ds.CasamentoExato", 1);
      assertNotNull("Result should not be null", result);
  }

  private void callForcaBrutaWithZeroIndex() {
      CasamentoExato.forcaBruta("^x:xB", 0, "A,oV]LGA!o;.I24TI", 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String result = CasamentoExato.forcaBruta("^x:xB", 0, "A,oV]LGA!o;.I24TI", 0);
      assertNotNull("Result should not be null", result);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
      assertNotNull("Instance should not be null", casamentoExato0);
  }
}