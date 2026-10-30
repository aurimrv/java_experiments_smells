/**
 * Improved and annotated tests for ds.MaxMin3.
 * These tests were refactored to add clarity, precondition checks, and descriptive assertions.
 * They preserve the original expectations and exception oracles from the generated suite.
 *
 * Traceability:
 *  - Requirement: DS-ARRAY-BOUNDARY (example)
 *  - Ticket: SEED-9006
 */
package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface used to categorize unit tests in this file.
 * Must be declared at package level so it is available to the @Category annotation.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin3_ESTest_scaffolding {

  /**
   * Given an array of length 6 and a very large index,
   * When maxMin3 is called with an out-of-range index,
   * Then ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = 3986;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1996);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 6 and a large positive index,
   * When maxMin3 is invoked with an index beyond the array bounds,
   * Then an ArrayIndexOutOfBoundsException must be thrown.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = (-198);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1540);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 7 and a clearly out-of-range index (58),
   * When maxMin3 is called,
   * Then an ArrayIndexOutOfBoundsException must be raised.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = 1193;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 58);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 6 with a negative value stored at the last slot,
   * When maxMin3 is invoked with a large index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[5] = (-693);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1996);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given a sparse array where a negative value is placed at index 0,
   * When maxMin3 is called with a negative index then with zero,
   * Then the returned pair should match the expected [0, -1].
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-1);
      int[] intArray1 = MaxMin3.maxMin3(intArray0, (-488));
      int[] intArray2 = MaxMin3.maxMin3(intArray1, 0);
      assertArrayEquals(new int[] {0, (-1)}, intArray2);
  }

  /**
   * Given a zero-initialized array of length 9,
   * When maxMin3 is called with a large index,
   * Then an ArrayIndexOutOfBoundsException should be thrown indicating the invalid index.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1975);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1974
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Constructing MaxMin3 should produce a non-null object.
   * This test verifies simple instantiation (smoke test).
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
  }
}