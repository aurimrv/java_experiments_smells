package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing these tests as unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * GIVEN an array of length 2 with the first element initialized
   * WHEN ordena is invoked with an index/value that is out of bounds
   * THEN an ArrayIndexOutOfBoundsException is expected and the array should remain consistent.
   *
   * Requirement trace: REQ-ORDER-OUT-01
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1173;
      // Undeclared exception!
      try { 
        Ordenacao.ordena(intArray0, 1173);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * GIVEN an array filled with zeros
   * WHEN ordena is invoked with a valid index parameter
   * THEN the array should remain as an all-zero array (sorted in-place).
   *
   * Requirement trace: REQ-ORDER-INS-01
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      Ordenacao.ordena(intArray0, 2);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  /**
   * GIVEN the Ordenacao type
   * WHEN constructing an instance
   * THEN the instance should be non-null and of the correct type.
   *
   * Requirement trace: REQ-ORDER-CTOR-01
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}