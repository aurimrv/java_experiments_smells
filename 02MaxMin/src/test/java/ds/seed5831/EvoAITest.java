package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import ds.MaxMin1;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and more robust tests for MaxMin1.
 *
 * These tests retain the original test method names (test0..test3) but provide
 * clearer assertions, basic Given-When-Then structure, and category annotations
 * so they can be selectively executed.
 *
 * Requirement reference: REQ-1234 (example)
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Given an array of length 7, when maxMin1 is invoked with a large index,
   * then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      int[] intArray0 = new int[7];
      intArray0[1] = -377;

      // When / Then
      try {
          MaxMin1.maxMin1(intArray0, 314);
          fail("Expected ArrayIndexOutOfBoundsException when calling maxMin1 with out-of-range index");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Basic sanity checks on the thrown exception
          assertNotNull("Exception message should not be null", e.getMessage());
          // Message should normally contain a numeric index (defensive check)
          assertTrue("Expected exception message to contain a digit indicating the bad index",
                     e.getMessage().matches(".*\\d.*"));
      }
  }

  /**
   * Given an array of length 7 with a single large value set, when maxMin1 is
   * invoked with an out-of-range index, then an ArrayIndexOutOfBoundsException
   * is expected.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      int[] intArray0 = new int[7];
      intArray0[2] = 5420;

      // When / Then
      try {
          MaxMin1.maxMin1(intArray0, 314);
          fail("Expected ArrayIndexOutOfBoundsException when calling maxMin1 with out-of-range index");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Basic sanity checks on the thrown exception
          assertNotNull("Exception message should not be null", e.getMessage());
          assertTrue("Expected exception message to contain a digit indicating the bad index",
                     e.getMessage().matches(".*\\d.*"));
      }
  }

  /**
   * Given a zero-initialized array of length 5, when maxMin1 is invoked with
   * a valid index (0), then the returned array must contain exactly two
   * elements representing min and max values and both should be zero.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      int[] intArray0 = new int[5]; // all zeros by default

      // When
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);

      // Then
      assertNotNull("Result should not be null", intArray1);
      assertEquals("Result should contain exactly two elements (min and max)", 2, intArray1.length);
      // For a zero-filled input array both min and max must be 0 (order may vary depending on implementation,
      // so assert both elements are zero).
      assertEquals("First element should be 0 for a zero-filled input", 0, intArray1[0]);
      assertEquals("Second element should be 0 for a zero-filled input", 0, intArray1[1]);
  }

  /**
   * Basic construction test for MaxMin1: ensure the object can be instantiated
   * and has the expected runtime type.
   *
   * This test supplements the static-method focused tests by asserting basic
   * object creation and class identity.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given / When
      MaxMin1 maxMin1_0 = new MaxMin1();

      // Then
      assertNotNull("Constructor should produce a non-null instance", maxMin1_0);
      assertEquals("Instance should be of type MaxMin1", MaxMin1.class, maxMin1_0.getClass());
      // Sanity: calling getClass().getSimpleName helps detect classloader issues
      assertEquals("Class simple name should be 'MaxMin1'", "MaxMin1", maxMin1_0.getClass().getSimpleName());
  }
}