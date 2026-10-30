package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests in this package.
 * Placed at package level so it can be used with @Category.
 */
interface UnitTest {}

/**
 * Improved and documented version of the originally auto-generated tests.
 * Tests follow a Given-When-Then structure and include clearer assertions and messages.
 *
 * Note: ORACLE PRESERVATION:  and  kept exactly as in the original.
 */
 
 
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  /**
   * Given: an array of length 4 with the first element set to a value.
   * When: maxMin2 is invoked with an index well beyond the array bounds (65).
   * Then: an ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement: MAXMIN-INDEX-BOUNDARY-1
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 65;
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array of length 4 with the second element set to a value.
   * When: maxMin2 is invoked with an index well beyond the array bounds (65).
   * Then: an ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement: MAXMIN-INDEX-BOUNDARY-2
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 565;
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array of three zeros.
   * When: maxMin2 is invoked with index 0 (a simple valid call).
   * Then: the returned array must be non-null, of length 2, and contain the expected max and min values.
   *
   * Requirement: MAXMIN-BASIC-1
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * Given: construction of the MaxMin2 utility class.
   * When: the constructor is invoked.
   * Then: instance should be non-null and of the expected type.
   *
   * Requirement: MAXMIN-CONSTRUCTOR-1
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
  }
}