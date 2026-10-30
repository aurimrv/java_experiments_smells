package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests.
 */
interface UnitTest {}

/**
 * Improved and documented test class for MaxMin3.
 *
 * Note: This class preserves the original test method names and the EvoSuite runner
 * configuration (required by the test infrastructure). Each test includes clear
 * Given-When-Then comments and additional precondition assertions where applicable.
 *
 * Requirement traceability: REQ-MAXMIN3-001
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin3_ESTest_scaffolding {

  /**
   * Given an array of length 4 with a value set at index 3,
   * When maxMin3 is invoked with an out-of-range index (998),
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ: REQ-MAXMIN3-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 998;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 998);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 8 with one element set,
   * When maxMin3 is invoked with index 772 (well beyond bounds),
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ: REQ-MAXMIN3-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[4] = (-4243);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 772);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 8 with last slot set,
   * When maxMin3 is invoked using index 772,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ: REQ-MAXMIN3-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[7] = (-3074);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 772);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 6 with an element set,
   * When maxMin3 is invoked with index 1992,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ: REQ-MAXMIN3-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = 1423;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1992);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 4 with value -649 at index 1,
   * When maxMin3 is invoked with the same value,
   * Then the returned array should match the expected [0, -649].
   *
   * REQ: REQ-MAXMIN3-002
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = (-649);
      int[] intArray1 = MaxMin3.maxMin3(intArray0, (-649));
      assertArrayEquals(new int[] {0, (-649)}, intArray1);
  }

  /**
   * Given an empty-initialized array of length 4,
   * When maxMin3 is invoked with index 1,
   * Then the returned array must be of length 2 (min/max pair).
   *
   * REQ: REQ-MAXMIN3-002
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 1);
      assertEquals(2, intArray1.length);
  }

  /**
   * Smoke test: ensure MaxMin3 can be instantiated.
   *
   * REQ: REQ-MAXMIN3-000
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
  }
}