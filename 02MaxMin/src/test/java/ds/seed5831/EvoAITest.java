package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 * Declared at package level so it can be referenced by the @Category annotation.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Given an int array of length 7 with one negative entry,
   * When maxMin1 is invoked with a very large positive index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = (-377);
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 314);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * Given an int array of length 7 with one large positive entry,
   * When maxMin1 is invoked with a far out-of-range index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = 5420;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 314);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * Given a zero-initialized int array of length 5,
   * When maxMin1 is invoked with index 0,
   * Then it should return a two-element array [min, max] and both values should be 0.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * Constructor smoke test.
   * Given no prior state,
   * When the MaxMin1 constructor is invoked,
   * Then an instance of MaxMin1 should be created.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
  }
}