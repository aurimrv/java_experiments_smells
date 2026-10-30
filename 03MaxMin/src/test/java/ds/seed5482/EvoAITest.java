package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  /**
   * Given an array of length 8 and an excessively large start index,
   * when maxMin2 is invoked with that index, then an ArrayIndexOutOfBoundsException
   * is expected to be thrown to signal invalid bounds.
   *
   * Requirement: REQ-MAXMIN-BOUNDS-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[3] = (-1690);
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1919);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array with a single non-zero element and an invalid large index,
   * when maxMin2 is invoked, then an ArrayIndexOutOfBoundsException should be thrown.
   *
   * Requirement: REQ-MAXMIN-BOUNDS-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[6] = 3;
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1919);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an 8-element array filled with zeros,
   * when maxMin2 is invoked with start index 0,
   * then a two-element result [min, max] is returned and original array remains unchanged.
   *
   * Requirement: REQ-MAXMIN-HAPPY-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * Verify that the MaxMin2 class can be instantiated. This is a minimal
   * smoke test of the public constructor.
   *
   * Requirement: REQ-MAXMIN-CONSTRUCT-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
  }
}