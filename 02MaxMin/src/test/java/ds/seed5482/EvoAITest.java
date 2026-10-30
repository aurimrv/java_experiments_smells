package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface used to categorize unit tests for selective execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Given: an int array with a negative value at index 3 and length 8.
   * When: maxMin1 is invoked with a large out-of-range index.
   * Then: an ArrayIndexOutOfBoundsException is expected and its message is verified to be null.
   *
   * Traceability: REQ-ARRAY-BOUNDS-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[3] = (-1690);
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 1919);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an int array with a small positive value set and length 8.
   * When: maxMin1 is invoked with a large out-of-range index.
   * Then: an ArrayIndexOutOfBoundsException is expected and its message is verified to be null.
   *
   * Traceability: REQ-ARRAY-BOUNDS-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[6] = 3;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 1919);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: a default int array of length 8.
   * When: maxMin1 is invoked with index 0.
   * Then: the result is a non-null array with length 2 (expected by the original oracle).
   *
   * Traceability: REQ-MAXMIN-RETURN-LENGTH
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * Given: constructing a MaxMin1 instance.
   * Then: instance is non-null and of the expected type.
   *
   * Traceability: REQ-CONSTRUCTOR-EXISTS
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
  }
}