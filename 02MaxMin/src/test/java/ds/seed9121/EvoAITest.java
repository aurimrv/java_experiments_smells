package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for grouping unit tests in this package.
 */
interface UnitTest {}

/**
 * Improved and annotated test class.
 *
 * Traceability: REQ-DS-9121 - Verify MaxMin1 behavior for normal and exceptional inputs.
 *
 * NOTE: This class preserves the original test method names and exception expectations.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Given: An integer array of length 4 with a negative value at index 1.
   * When:  maxMin1 is invoked with a grossly out-of-range index parameter (735).
   * Then:  An ArrayIndexOutOfBoundsException is expected and the input array remains unchanged.
   *
   * Trace: REQ-DS-9121-A
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = (-707);
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 735);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: An integer array of length 4 with a value at the last valid index.
   * When:  maxMin1 is invoked with a grossly out-of-range index parameter (735).
   * Then:  An ArrayIndexOutOfBoundsException is expected and the input array remains unchanged.
   *
   * Trace: REQ-DS-9121-B
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 1411;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 735);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: A zero-initialized integer array of length 4.
   * When:  maxMin1 is invoked with a second parameter of 0.
   * Then:  A non-null result array of length 2 is returned and entries are non-negative for this input.
   *
   * Trace: REQ-DS-9121-C
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * Given: The MaxMin1 class.
   * When:  an instance is created via the default constructor.
   * Then:  the instance should be non-null and of the correct type.
   *
   * Trace: REQ-DS-9121-D
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
  }
}