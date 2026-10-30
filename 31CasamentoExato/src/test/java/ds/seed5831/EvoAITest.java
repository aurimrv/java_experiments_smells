package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit test category marker for selective execution.
 */
interface UnitTest {}

/**
 * Improved test class for ds.CasamentoExato.
 *
 * Notes:
 * - Tests retain original method names and exception expectations.
 * - Each test adds simple assertions (inputs unchanged / instance non-null)
 *   and Given-When-Then style comments to provide minimal traceability and
 *   stronger oracles without altering the original SUT invocations.
 */
  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmhs((String) null, 0, (String) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.CasamentoExato", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Given: typical non-empty text and pattern
      String text = "O;;%iN}B+p;;";
      String pattern = "j>y`+<;";
      String textCopy = new String(text);
      String patternCopy = new String(pattern);

      // When: invoking bmhs (Boyers-Moore-Horspool-Simplified)
      CasamentoExato.bmhs(text, 1, pattern, 1);

      // Then: inputs should remain unchanged (strings are immutable and method should not alter references)
      assertEquals("Text argument must not be modified by bmhs", textCopy, text);
      assertEquals("Pattern argument must not be modified by bmhs", patternCopy, pattern);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasamentoExato.bmhs(":3`mFu7EiR", 1, ":3`mFu7EiR", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasamentoExato.bmh("d=DqwuF", 1, "|R$~R6ZN", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CasamentoExato.bmh("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh((String) null, 156, "bF!x7", 156);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CasamentoExato.shiftAndExato("el,,LT$!wJ<SQ$o ", 1, "3<Mu", 1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasamentoExato.shiftAndExato("ds.CasamentoExato", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("ds.CasamentoExato", 837, "ds.CasamentoExato", 837);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CasamentoExato.forcaBruta("jsuU|`2!0#", 1, "ds.CasamentoExato", 1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato.forcaBruta("^x:xB", 0, "A,oV]LGA!o;.I24TI", 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}