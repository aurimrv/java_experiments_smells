package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.experimental.categories.Category;

// Marker interface for test categorization
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  @Before
  public void setUp() {
    // Common setup can be placed here if needed in future
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: an array of length 4 with a value set
      int[] intArray0 = new int[4];
      intArray0[1] = 455;
      // When/Then: calling mergeSort with an out-of-range high should throw ArrayIndexOutOfBoundsException
      try {
        Ordenacao.mergeSort(intArray0, 0, 651);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
         // verifyException is part of EvoSuite helper assertions — preserve original verification
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}