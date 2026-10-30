package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for test categorization.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

    // Shared constants to reduce magic literals and clarify intent
    private static final String SAMPLE_TEXT_1 = "Casamento na posicao: ";
    private static final String SAMPLE_PATTERN_1 = "]A0";
    private static final String SAMPLE_PATTERN_2 = "m5O|4wu";
    private static final String SAMPLE_I116YN = "i116YN";
    private static final String SAMPLE_SHIFT = "x.~ZJ8s'vOp";
    private static final String SAMPLE_BRUTE_TEXT = "i4e55_m(vwF";
    private static final String SAMPLE_BRUTE_PATTERN = "<w:AV$r;AFk<0";

    /**
     * Helper: invoke bmhs and return whether invocation completed without throwing.
     */
    private static boolean safeInvokeBmhs(final String pattern, final int pLen, final String text, final int tLen) {
        try {
            CasamentoExato.bmhs(pattern, pLen, text, tLen);
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    /**
     * Helper: invoke bmh and return whether invocation completed without throwing.
     */
    private static boolean safeInvokeBmh(final String pattern, final int pLen, final String text, final int tLen) {
        try {
            CasamentoExato.bmh(pattern, pLen, text, tLen);
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    /**
     * Helper: invoke shiftAndExato and return whether invocation completed without throwing.
     */
    private static boolean safeInvokeShiftAndExato(final String text, final int textLen, final String pattern, final int patLen) {
        try {
            CasamentoExato.shiftAndExato(text, textLen, pattern, patLen);
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    /**
     * Helper: invoke forcaBruta and return whether invocation completed without throwing.
     */
    private static boolean safeInvokeForcaBruta(final String text, final int textLen, final String pattern, final int patLen) {
        try {
            CasamentoExato.forcaBruta(text, textLen, pattern, patLen);
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given: pattern and text of equal content but with an out-of-range length argument
        final String pattern = "JIqJFkeFu%NTT8";
        final String text = "JIqJFkeFu%NTT8";
        // When/Then: calling bmhs with an excessively large length should produce a StringIndexOutOfBoundsException
        try {
            CasamentoExato.bmhs(pattern, 256, text, 1);
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception: test passes when this exception is thrown
        }
    }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CasamentoExato.bmhs("]A0", 1, "Casamento na posicao: ", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasamentoExato.bmh("Casamento na posicao: ", 1, "m5O|4wu", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasamentoExato.bmh("i116YN", 1, "i116YN", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh("I=\";9M{,gOBp a4V#&", (-856), "", 3672);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.shiftAndExato("V) o#u/4qDc_.K", 1653, "i't#aCU ,v", (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CasamentoExato.shiftAndExato("x.~ZJ8s'vOp", 1, "x.~ZJ8s'vOp", 1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasamentoExato.forcaBruta("<w:AV$r;AFk<0", 0, "i4e55_m(vwF", 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("Ln", 3554, "Ln", 383);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CasamentoExato.forcaBruta("i4e55_m(vwF", 6979, "<w:AV$r;AFk<0", 6979);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}
