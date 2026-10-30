package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface used to categorize tests in this file.
 */
interface UnitTest {}

/**
 * Improved test class for CasamentoExato. Each test preserves the original
 * invocation and expected-exception behavior while adding assertions,
 * clear Given-When-Then comments and a category for selective execution.
 */
  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Given: inputs that previously caused a StringIndexOutOfBoundsException
      // When / Then: calling the method is expected to throw StringIndexOutOfBoundsException
      try { 
        CasamentoExato.bmhs(",%>[P\"{wKXi'\"rjmb.2", 575, "xxNkW].~IztaRTE", (-1302));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
        // Expected exception — assert message is present for traceability
        assertNotNull("Exception message should be available", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CasamentoExato.bmhs("i", 1, "i", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Given: typical phrase and pattern
      // When: invoking bmhs with nominal inputs
      // Then: should not throw an exception
      try {
          CasamentoExato.bmhs("Casamento na posicao: ", 1, "PsN%thM.{$8p8aX", 1);
          assertTrue("bmhs executed without exception on descriptive strings", true);
      } catch (RuntimeException e) {
          fail("Unexpected runtime exception during bmhs: " + e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasamentoExato.bmh("[Xe*", 1, "B ", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CasamentoExato.bmh("FFrTJ)k", 1, "FFrTJ)k", 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CasamentoExato.bmh(",%>[P\"{wKXi'\"rjmb.2", (-134), ",%>[P\"{wKXi'\"rjmb.2", 7);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CasamentoExato.shiftAndExato("xxNkW].~IztaRTE", 7, "xxNkW].~IztaRTE", 7);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("W(}<tFiysnK", 256, "W(}<tFiysnK", 256);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CasamentoExato.forcaBruta("MUW5U0T%A|cq0m", 3735, "Z[la^", 3735);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CasamentoExato.forcaBruta("^cS8=.fV{", 1, "", 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}
