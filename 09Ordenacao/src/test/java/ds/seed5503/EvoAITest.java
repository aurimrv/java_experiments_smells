package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test0()  throws Throwable  {
      // Given: an array of length 7 with one element set
      int[] array = new int[7];
      array[4] = 3641;
      // When: calling mergeSort with an out-of-range end index
      Ordenacao.mergeSort(array, 2, 2111);
      // Then: ArrayIndexOutOfBoundsException is expected (declared via @Test.expected)
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given-When-Then: smoke test for constructor
      Ordenacao ordenacao0 = new Ordenacao();
  }
}