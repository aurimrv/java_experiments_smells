package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

/**
 * Improved test class for MaxMin3.
 *
 * Traceability: REQ-DS-001 (index and null handling for maxMin3)
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin3_ESTest_scaffolding {

  /**
   * Given: an array of length 6 with a value at the last index.
   * When: maxMin3 is invoked with an excessively large positive index.
   * Then: an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[5] = 2988;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 2988);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given: an array of length 6 with a negative value set.
   * When: maxMin3 is invoked with a very large index.
   * Then: an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[4] = (-2940);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 342);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given: an array of length 6 with a value at index 2.
   * When: maxMin3 is invoked with an index far beyond bounds.
   * Then: an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = 342;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 342);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given: an array of length 5 with a value at index 3.
   * When: maxMin3 is invoked with an index well beyond the array size.
   * Then: an ArrayIndexOutOfBoundsException is expected.
   *
   * REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[3] = (-825);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 18);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given: a minimal two-element array and a valid index 0.
   * When: maxMin3 is invoked.
   * Then: it returns an array with expected max/min ordering.
   *
   * REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 0);
      assertArrayEquals(new int[] {1, 0}, intArray1);
  }

  /**
   * Given: a null input reference.
   * When: maxMin3 is invoked.
   * Then: a NullPointerException is expected.
   *
   * REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3((int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given: constructing MaxMin3 instance.
   * When: default constructor is invoked.
   * Then: a non-null instance is created.
   *
   * REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
  }
}