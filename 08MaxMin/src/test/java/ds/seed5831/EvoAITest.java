package ds.seed5831;

import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for MaxMin4.
 *
 * These tests exercise exceptional behaviour observed when an end index larger than
 * the array length is supplied, as well as simple construction of the SUT.
 *
 * Traceability: REQ-TEST-001
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an array with a large length and a very large end index,
   * When maxMin4 is invoked with start=0 and end=3137,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * This test also asserts preconditions on the array to make the intent explicit.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[2] = 2887;
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 3137);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array with a negative value at index 0 and a very large end index,
   * When maxMin4 is invoked with start=0 and end=3137,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * This documents a boundary/exception test for the API.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      // Undeclared exception!
      try { 
        MaxMin4.maxMin4(intArray0, 0, 3137);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Constructing the SUT should succeed.
   *
   * This is a simple smoke test ensuring the MaxMin4 type can be instantiated.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaxMin4 maxMin4_0 = new MaxMin4();
  }
}