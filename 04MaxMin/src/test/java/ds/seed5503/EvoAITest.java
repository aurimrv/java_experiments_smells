package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for traceability to a hypothetical requirement/story.
 * Tests in this class are associated with requirement ID: REQ-MAXMIN3-1.
 */
interface RequirementTest {}

 
 
@Category(RequirementTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin3_ESTest_scaffolding {

  /**
   * Given an array of length 6 with a value set at index 3,
   * When maxMin3 is invoked with an index equal to the stored value (782),
   * Then an ArrayIndexOutOfBoundsException is expected because the implementation
   * uses the provided integer as an index into the array.
   *
   * Traceability: REQ-MAXMIN3-1
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = 782;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 782);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 9 with a negative value placed in the middle,
   * When maxMin3 is invoked with a large index (976),
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Traceability: REQ-MAXMIN3-1
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[4] = (-2288);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 976);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 9 with a positive value early in the array,
   * When maxMin3 is invoked with a large index (976),
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Traceability: REQ-MAXMIN3-1
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[2] = 2126;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 976);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 6 with a value at the last index,
   * When maxMin3 is invoked with that value (which is negative here),
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Traceability: REQ-MAXMIN3-1
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[5] = (-3062);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 782);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given a minimal array of length 2 with first element populated,
   * When maxMin3 is invoked with a negative index (-764),
   * Then the method should return an int[2] containing the max and min values.
   *
   * This is a happy-path test asserting the concrete result array.
   *
   * Traceability: REQ-MAXMIN3-1
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 3843;
      int[] intArray1 = MaxMin3.maxMin3(intArray0, (-764));
      assertArrayEquals(new int[] {3843, 0}, intArray1);
  }

  /**
   * Given a minimal array of length 2 and default values,
   * When maxMin3 is invoked with a positive large index (509),
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Traceability: REQ-MAXMIN3-1
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 509);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 508
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Constructor sanity check: creating an instance should succeed.
   *
   * Traceability: REQ-MAXMIN3-1
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
  }
}