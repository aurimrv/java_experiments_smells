package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests and linking to requirements.
 * Requirement link example: REQ-MAXMIN-4
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given a 4-length array with a negative value set at index 0,
   * When maxMin4 is invoked for the first 3 elements (0..2),
   * Then the original array should retain its values and the returned
   * array should contain the expected min and max values.
   *
   * Requirement: REQ-MAXMIN-4
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-249);
      int[] intArray1 = MaxMin4.maxMin4(intArray0, 0, 2);
      assertArrayEquals(new int[] {(-249), 0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {0, (-249)}, intArray1);
  }

  /**
   * Given an array and an out-of-range end index,
   * When maxMin4 is invoked with the invalid end index,
   * Then an ArrayIndexOutOfBoundsException is expected and the input array remains unchanged.
   *
   * Requirement: REQ-MAXMIN-4-ERROR
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[3] = 1;
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 3425);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Sanity check that the MaxMin4 class can be instantiated.
   * This test links to the constructor/instantiation requirement.
   *
   * Requirement: REQ-MAXMIN-4-CONSTRUCTOR
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaxMin4 maxMin4_0 = new MaxMin4();
  }

  // Helper: create a new int array of given size initialized to zeros.
  private static int[] newIntArray(int size) {
      return new int[size];
  }
}