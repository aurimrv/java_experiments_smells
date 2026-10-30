package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  /**
   * REQ-001: Verify that calling maxMin2 with an out-of-range positive index
   * triggers ArrayIndexOutOfBoundsException (error path).
   *
   * Given an array of fixed length
   * When maxMin2 is invoked with a very large index
   * Then an ArrayIndexOutOfBoundsException is thrown and its message is null
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 7;
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 3730);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * REQ-002: Verify that calling maxMin2 with an out-of-range index still throws
   * an ArrayIndexOutOfBoundsException even when other array elements are populated.
   *
   * Given an array with a populated interior element
   * When maxMin2 is invoked with a far-out index
   * Then an ArrayIndexOutOfBoundsException is thrown
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[2] = 604;
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 3730);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * REQ-003: Validate normal behavior for a zero index: the method should return
   * a 2-element int array (e.g., min and max placeholders) and must not return null.
   *
   * Given an empty-initialized array of length 8
   * When maxMin2 is invoked with index 0
   * Then a non-null array of length 2 is returned
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * REQ-004: Sanity check that MaxMin2 can be instantiated.
   *
   * Given no preconditions
   * When constructing MaxMin2
   * Then the instance is created (not null)
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
  }
}