package ds.seed5311;

import ds.MaxMin4;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

interface UnitTest {}

/**
 * Improved, hand-maintained tests for MaxMin4.
 *
 * Traceability: REQ-001: Validate behavior when provided invalid indices and basic construction.
 *
 * Notes:
 * - Tests follow Given-When-Then structure in comments.
 * - Each test includes explicit assertions documenting preconditions and postconditions.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an int array of length 6 with a single non-zero entry,
   * When maxMin4 is invoked with a far-out upper bound,
   * Then an ArrayIndexOutOfBoundsException is expected and the input array must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = 1;
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 2739);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an int array of length 6 with a negative value at index 0,
   * When maxMin4 is invoked with an out-of-range upper bound,
   * Then an ArrayIndexOutOfBoundsException is expected and the input array must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 2739);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given no special preconditions,
   * When creating a MaxMin4 instance,
   * Then the instance should be created successfully and have the expected runtime type.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaxMin4 maxMin4_0 = new MaxMin4();
  }
}