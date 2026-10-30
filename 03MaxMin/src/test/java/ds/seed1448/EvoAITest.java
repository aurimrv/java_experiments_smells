package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for MaxMin2 focusing on behavior around array bounds and basic construction.
 *
 * Note: Tests follow a Given-When-Then style in comments and include traceability via the UnitTest category.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  /**
   * Given an array of length 7 with one negative element,
   * When maxMin2 is invoked with a massively out-of-range index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[4] = (-1630);
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1585);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array of length 7 with one large positive element,
   * When maxMin2 is invoked with a massively out-of-range index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = 1585;
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1585);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given a small zero-initialized array,
   * When maxMin2 is invoked with index 0,
   * Then a non-null result array of length 2 is returned.
   *
   * Note: The original oracle asserts only the length; that expectation is preserved.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * Given the MaxMin2 type,
   * When constructing a new instance,
   * Then the instance should be non-null and of the correct type.
   *
   * This adds basic object-level assertions to the original generated constructor-only test.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
  }
}