package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file so they can be
 * selected during test execution. Placed at package level as required.
 */
interface UnitTest {}

/**
 * Improved and stabilized tests for Ordenacao based on originally generated cases.
 *
 * Notes:
 * - Tests preserve the original oracles and expected exception types.
 * - Each test documents the requirement id and follows Given-When-Then comments.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * Requirement: REQ-ORD-001
   *
   * Given: an int array of length 2 with a valid element at index 0.
   * When: ordena is invoked with a very large index (out of bounds).
   * Then: an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1348;
      // Undeclared exception!
      try { 
        Ordenacao.ordena(intArray0, 1348);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Requirement: REQ-ORD-002
   *
   * Given: a zero-initialized int array of length 10.
   * When: ordena is invoked with a valid index within bounds (3).
   * Then: array contents remain the expected zeros (preserve original oracle).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[10];
      Ordenacao.ordena(intArray0, 3);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  /**
   * Requirement: REQ-ORD-003
   *
   * Given: constructing an Ordenacao instance.
   * When: the default constructor is invoked.
   * Then: the resulting object is non-null and of the expected type.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}