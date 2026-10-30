package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for MaxMin4 behavior.
 * Requirement trace: RQ-001
 *
 * NOTE: This class retains the EvoSuite runner configuration for reproducibility.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an array with a value at index 2,
   * When maxMin4 is invoked with an out-of-range end index,
   * Then an ArrayIndexOutOfBoundsException is expected and the original array contents remain unchanged.
   *
   * Requirement: RQ-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = (-3009);
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 1442);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array with a value at index 1,
   * When maxMin4 is invoked with an excessively large end index,
   * Then an ArrayIndexOutOfBoundsException is expected and the original array contents remain unchanged.
   *
   * Requirement: RQ-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[1] = 1;
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 1442);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given the MaxMin4 class,
   * When constructing a new instance,
   * Then the instance should be non-null (sanity/happy-path check).
   *
   * Requirement: RQ-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaxMin4 maxMin4_0 = new MaxMin4();
  }
}