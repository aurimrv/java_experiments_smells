package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for Ordenacao based on original EvoSuite-generated class.
 * Tests retain original method names and expected exception behavior.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 2191;
      // Undeclared exception!
      try { 
        Ordenacao.ordena(intArray0, 842);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      Ordenacao.ordena(intArray0, 3);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}