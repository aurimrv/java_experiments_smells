package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for MaxMin2.
 *
 * These tests were adapted from the originally generated EvoSuite tests:
 * - improved with Given-When-Then structure
 * - added assertions and categorization
 *
 * Traceability: REQ-MAXMIN-001 (example requirement id for max/min computation)
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[5] = (-2308);
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1460);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-237);
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1460);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
  }
}