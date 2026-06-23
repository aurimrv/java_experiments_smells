package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

  private int[] createTestArray() {
    int[] arr = new int[4];
    arr[1] = 455;
    return arr;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createTestArray();
    // Test with valid max index boundary
    Ordenacao.mergeSort(intArray0, 0, 3);
    // Test just outside valid range boundary
    try {
      Ordenacao.mergeSort(intArray0, 0, 4);
      fail("Expected ArrayIndexOutOfBoundsException when calling mergeSort with index 4");
    } catch (ArrayIndexOutOfBoundsException e) {
      verifyException("ds.Ordenacao", e);
    }
    // Original invalid index test
    try {
      Ordenacao.mergeSort(intArray0, 0, 651);
      fail("Expected ArrayIndexOutOfBoundsException when calling mergeSort with invalid index 651");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertEquals("Array index out of bounds: 651", e.getMessage());
      verifyException("ds.Ordenacao", e);
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    Ordenacao ordenacao0 = new Ordenacao();
    assertNotNull("Ordenacao instance should not be null", ordenacao0);
    // TODO: Add tests for normal and exceptional flows of Ordenacao methods here.
  }
}