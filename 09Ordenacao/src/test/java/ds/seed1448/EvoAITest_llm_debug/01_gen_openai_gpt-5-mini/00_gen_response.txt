package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * REQ-001: mergeSort invalid-end-index -> expects ArrayIndexOutOfBoundsException
   */
  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 55;
      Ordenacao.mergeSort(intArray0, 0, 3167);
  }

  /**
   * REQ-002: mergeSort happy-path verification for small arrays
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
      assertNotNull("Ordenacao instance should be created", ordenacao0);

      int[] arr = new int[] {5, 2, 8};
      Ordenacao.mergeSort(arr, 0, arr.length - 1);
      assertArrayEquals("Array should be sorted in ascending order", new int[] {2,5,8}, arr);
  }
}