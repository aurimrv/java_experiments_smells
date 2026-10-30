package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 * Placed at package level as required by the test-generation rules.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given: an array of length 9 with a negative value assigned at index 5.
   * When:  maxMin4 is invoked with a valid start index (0) and an excessively large end index (1551).
   * Then:  an ArrayIndexOutOfBoundsException is expected because the end index exceeds array bounds.
   *
   * Requirement: REQ-ARRAY-BOUNDS-001 - Methods must validate index ranges and throw ArrayIndexOutOfBoundsException
   * when indices are outside the valid bounds.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[5] = (-669);
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 1551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array of length 9 with a large positive value assigned at index 2.
   * When:  maxMin4 is invoked with start index 0 and end index 1551 (out-of-range).
   * Then:  an ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement: REQ-ARRAY-BOUNDS-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[2] = 3025;
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 1551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array of length 9 with a negative value assigned at index 7.
   * When:  maxMin4 is invoked with an out-of-range end index (1551).
   * Then:  an ArrayIndexOutOfBoundsException is expected to indicate invalid end index handling.
   *
   * Requirement: REQ-ARRAY-BOUNDS-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[7] = (-957);
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 1551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: the MaxMin4 type.
   * When:  an instance is constructed.
   * Then:  the instance should be non-null and its runtime type should match ds.MaxMin4.
   *
   * Requirement: REQ-CONSTRUCTOR-001 - Constructor should create a valid non-null instance.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin4 maxMin4_0 = new MaxMin4();
  }
}