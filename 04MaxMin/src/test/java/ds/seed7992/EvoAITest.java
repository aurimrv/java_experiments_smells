package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test class providing clearer structure, traceability comments (REQ IDs),
 * Given-When-Then sections and additional lightweight precondition assertions while
 * preserving original test oracles and exception expectations.
 *
 * NOTE: EvoRunner/EvoRunnerParameters usage is preserved per ORACLE PRESERVATION rules.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin3_ESTest_scaffolding {

    // Common constants to avoid magic numbers inline and to document intent.
    private static final int SIZE_7 = 7;
    private static final int SIZE_4 = 4;
    private static final int SIZE_8 = 8;
    private static final int SIZE_3 = 3;
    private static final int SIZE_0 = 0;

    private static final int IDX_3 = 3;
    private static final int IDX_2 = 2;
    private static final int IDX_4 = 4;

    private static final int OFFSET_1096 = 1096;
    private static final int OFFSET_648 = 648;
    private static final int OFFSET_2160 = 2160;
    private static final int OFFSET_248 = 248;
    private static final int OFFSET_3221 = 3221;
    private static final int NEG_OFFSET_650 = -650;

    private static final int VAL_1277 = 1277;
    private static final int VAL_NEG_119 = -119;
    private static final int VAL_NEG_3051 = -3051;
    private static final int VAL_1503 = 1503;
    private static final int VAL_1 = 1;

    /**
     * REQ-001: Validate behavior when calling maxMin3 with a large positive offset.
     * Given: an array of length 7 with one element set
     * When: maxMin3 is invoked with a very large second parameter
     * Then: an ArrayIndexOutOfBoundsException is expected
     */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[3] = 1277;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1096);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin3", e);
      }
  }

    /**
     * REQ-002: Validate behavior when calling maxMin3 with another large positive offset.
     * Given: an array of length 4 with one negative element
     * When: maxMin3 is invoked with an out-of-range offset
     * Then: an ArrayIndexOutOfBoundsException is expected
     */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = (-119);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 648);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin3", e);
      }
  }

    /**
     * REQ-003: Validate behavior when calling maxMin3 with a very large positive offset (different array size).
     * Given: an array of length 8 with one negative element
     * When: maxMin3 is invoked with an excessively large offset
     * Then: an ArrayIndexOutOfBoundsException is expected
     */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[3] = (-3051);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 2160);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin3", e);
      }
  }

    /**
     * REQ-004: Validate behavior when calling maxMin3 with large positive offset on another array size.
     * Given: an array of length 7 with one element set to a large positive value
     * When: maxMin3 is invoked with a large offset
     * Then: ArrayIndexOutOfBoundsException is expected
     */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[4] = 1503;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1096);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin3", e);
      }
  }

    /**
     * REQ-005: Happy-path: calling maxMin3 with a negative offset on a small array should return an array of length 2.
     * Given: an array of length 3
     * When: maxMin3 is invoked with a negative offset
     * Then: a non-null result array of length 2 is returned
     */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin3.maxMin3(intArray0, (-650));
      assertEquals(2, intArray1.length);
  }

    /**
     * REQ-006: Validate behavior when calling maxMin3 with a moderately large offset.
     * Given: an array of length 4 with one element set
     * When: maxMin3 is invoked with an offset far beyond array bounds
     * Then: an ArrayIndexOutOfBoundsException is expected
     */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 248);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin3", e);
      }
  }

    /**
     * REQ-007: Validate behavior when calling maxMin3 with an empty array and a large offset.
     * Given: an empty array
     * When: maxMin3 is invoked with a large positive offset
     * Then: an ArrayIndexOutOfBoundsException is expected
     */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 3221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3220
         //
         verifyException("ds.MaxMin3", e);
      }
  }

    /**
     * REQ-008: Simple construction test for MaxMin3 class.
     * Given: nothing beyond class availability
     * When: MaxMin3 is instantiated
     * Then: the resulting object should be non-null
     */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
  }
}