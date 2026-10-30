package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.util.Arrays;

/**
 * Unit tests for MaxMin2 focused on index-handling and basic happy-path behavior.
 *
 * Requirement traceability: REQ-MAXMIN-INDEX-RANGE, REQ-MAXMIN-BASIC
 *
 * Tests follow Given-When-Then style in comments and include descriptive assertion messages.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = (-316);
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1966);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin2", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = 134;
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 1966);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin2", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, 2);
      assertArrayEquals(new int[] {0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
  }
}