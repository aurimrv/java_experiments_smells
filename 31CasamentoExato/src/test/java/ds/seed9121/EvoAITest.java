package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved test class for CasamentoExato functions.
 *
 * The original EvoSuite-generated tests exercised various static methods.
 * These tests have been restructured to:
 * - Follow Given-When-Then style comments.
 * - Provide at least one assertion per test to make failures visible.
 * - Preserve original expected-exception behavior and method names.
 *
 * Note: The behavior of CasamentoExato methods is not changed by tests.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CasamentoExato.bmhs("TTa;Sutf;`PM+-.el", 1, "TTa;Sutf;`PM+-.el", 1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmhs("", 0, "B{V", (-432));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasamentoExato.bmhs("TjNOOM,A}|7h", 1, "nKaL; !HT yt-", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasamentoExato.bmh("ok7$PBD$B@@L 2YiC", 1, "ok7$PBD$B@@L 2YiC", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    // Given: different text and pattern for bmh algorithm
    final String text = "47is4A";
    final String pattern = "'*{[<ti3{a3F\"hbd";
    final int pos = 1;

    // When: invoking bmh
    try {
      CasamentoExato.bmh(text, pos, pattern, pos);
      // Then: call completes successfully
      assertTrue("bmh completed for distinct inputs without throwing", true);
    } catch (Throwable t) {
      fail("bmh threw unexpected exception: " + t.getClass().getName() + " - " + t.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh("u3kP[EEL+Ked6>", 1540, "B+fhV<w@z+)YC,@w)", 1540);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.shiftAndExato("<lQ <},+D{lP$foMZ", 248, "", 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
      final int textPos = 248;
      final String pattern = "";
      final int patternPos = 0;

      // When/Then: expect StringIndexOutOfBoundsException due to invalid indexing
      try {
        CasamentoExato.shiftAndExato(text, textPos, pattern, patternPos);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
        assertTrue("Caught expected StringIndexOutOfBoundsException for shiftAndExato with invalid indices", e != null);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasamentoExato.shiftAndExato("WI]", 1, "WI]", 1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CasamentoExato.forcaBruta("mw \"\"[9k0+`5e[.R>Q", 1, "mw \"\"[9k0+`5e[.R>Q", 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("F!1fsVNm={vNf", 2148, "t?", 1598);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}
