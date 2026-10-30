package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmhs("r</7,'(1?ozFe8", 1626, ")oGy!B+')V", 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CasamentoExato.bmhs("`", 1, "`", 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: identical pattern and text for bmh method
      // When: calling bmh with matching inputs
      // Then: the call should complete without throwing
      try {
        CasamentoExato.bmh("C6 {", 4, "C6 {", 1);
      } catch (Throwable t) {
        fail("Unexpected exception while invoking bmh with matching inputs: " + t);
      }
      assertTrue("bmh completed without throwing an exception for matching inputs", true);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh("`", 256, "", 256);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.shiftAndExato("zU<M&v\"JJ", 2794, "zU<M&v\"JJ", 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CasamentoExato.shiftAndExato("`", 1, "#0Lts%~RZI8t~j`$;", 1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CasamentoExato.forcaBruta("a", 256, "foqu:$yL6{tu\"9&M", 256);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("nlq4hZPi", 2505, "nlq4hZPi", 2505);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CasamentoExato.forcaBruta((String) null, 0, (String) null, 0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}
