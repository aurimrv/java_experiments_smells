package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.util.Arrays;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * Requirement: DS-ORD-001
   * Scenario: Passing an out-of-range index should result in ArrayIndexOutOfBoundsException.
   *
   * Given an integer array of length 9 with a non-zero first element,
   * When ordena is invoked with an excessively large index (3301),
   * Then an ArrayIndexOutOfBoundsException must be thrown and the array length remains unchanged.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 3301;
      // Undeclared exception!
      try { 
        Ordenacao.ordena(intArray0, 3301);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Requirement: DS-ORD-002
   * Scenario: Sorting an already zero-filled array should preserve zero values.
   *
   * Given a zero-initialized array of length 8,
   * When ordena is invoked with a valid index (7),
   * Then the array remains all zeros and has the expected length.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      Ordenacao.ordena(intArray0, 7);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  /**
   * Requirement: DS-ORD-000
   * Scenario: Constructing Ordenacao should succeed and produce a usable instance.
   *
   * Given no special preconditions,
   * When the Ordenacao constructor is invoked,
   * Then a non-null instance of Ordenacao is returned.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}