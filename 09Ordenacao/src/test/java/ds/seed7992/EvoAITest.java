package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

// Local test category marker (package-level)
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  /** Tests REQ-ORD-001: mergeSort must throw ArrayIndexOutOfBoundsException when end index is out of bounds */
  public void test0()  throws Throwable  {
      // Given: a small array with one negative value
      int[] arr = new int[5];
      arr[3] = -2309;
      // When / Then: calling mergeSort with an invalid end index must throw ArrayIndexOutOfBoundsException
      try {
        Ordenacao.mergeSort(arr, 2, 528);
        fail("Expected ArrayIndexOutOfBoundsException when end index is out of array bounds");
      } catch (ArrayIndexOutOfBoundsException e) {
         // Verify exception origin and keep existing EvoSuite verification helper
         verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}