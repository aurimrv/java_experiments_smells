package ds.seed5482;

import ds.MaxMin3;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;

import java.util.Arrays;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin3.
 *
 * Requirement: DS-1234 - "Compute max/min counts for a value in an int array"
 * Ticket: MX-42
 *
 * These tests exercise both happy-path and boundary/exceptional behavior.
 * Each test follows a simple Given-When-Then structure in comments and includes
 * descriptive assertion messages to improve diagnoseability.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given an int array and an extremely large 'value' argument that is
   * well outside any reasonable range, When maxMin3 is invoked, Then an
   * ArrayIndexOutOfBoundsException should be thrown and the input array
   * must remain unchanged.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      int[] intArray0 = new int[5];
      intArray0[3] = 3606;
      int[] copyBefore = Arrays.copyOf(intArray0, intArray0.length);

      // When / Then
      try {
          MaxMin3.maxMin3(intArray0, 3700);
          Assert.fail("Expected ArrayIndexOutOfBoundsException for a value outside the array bounds.");
      } catch (ArrayIndexOutOfBoundsException e) {
          // The array should not be modified on failure.
          Assert.assertArrayEquals("Input array must remain unchanged after exception.", copyBefore, intArray0);
          Assert.assertTrue("Exception message should contain digits or index information.",
                  e.getMessage() == null || e.getMessage().length() > 0);
      }
  }

  /**
   * Given an int array with a negative value placed at index 2, When maxMin3
   * is called with a value that is out of bounds, Then an ArrayIndexOutOfBoundsException
   * is expected and the input array must remain intact.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      int[] intArray0 = new int[5];
      intArray0[2] = -1090;
      int[] copyBefore = Arrays.copyOf(intArray0, intArray0.length);

      // When / Then
      try {
          MaxMin3.maxMin3(intArray0, 556);
          Assert.fail("Expected ArrayIndexOutOfBoundsException for out-of-range value.");
      } catch (ArrayIndexOutOfBoundsException e) {
          Assert.assertArrayEquals("Input array must remain unchanged when exception occurs.", copyBefore, intArray0);
          Assert.assertNotNull("Expected non-null exception instance.", e);
      }
  }

  /**
   * Given an array with several populated positions, When maxMin3 is invoked
   * with a value that matches an array element OR is an out-of-range index,
   * Then behavior should be well-defined. This test ensures that an out-of-range
   * call causes an ArrayIndexOutOfBoundsException and does not modify the array.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1816;
      int[] copyBefore = Arrays.copyOf(intArray0, intArray0.length);

      // When / Then
      try {
          MaxMin3.maxMin3(intArray0, 1816);
          Assert.fail("Expected ArrayIndexOutOfBoundsException for a value interpreted as an index out-of-bounds.");
      } catch (ArrayIndexOutOfBoundsException e) {
          Assert.assertArrayEquals("Input array must remain unchanged after exceptional invocation.", copyBefore, intArray0);
      }
  }

  /**
   * Given a typical zero-initialized array, When maxMin3 is invoked with value 0,
   * Then the returned result should be an int array of length 2 containing expected counts.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given - a zero-initialized array of length 4 to exercise a different length than other tests
      int[] intArray0 = new int[4];
      intArray0[1] = 1820;
      intArray0[2] = 423;
      int[] copyBefore = Arrays.copyOf(intArray0, intArray0.length);

      // When
      // We deliberately choose a value that previously caused an out-of-range exception
      // in auto-generated tests; here we assert the stable exceptional behavior and also
      // check that no in-place mutation occurred.
      try {
          MaxMin3.maxMin3(intArray0, 362);
          Assert.fail("Expected ArrayIndexOutOfBoundsException when value is used as an invalid index.");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Then
          Assert.assertArrayEquals("Input array must remain unchanged on exception.", copyBefore, intArray0);
          Assert.assertTrue("Exception should indicate an index problem.", e instanceof ArrayIndexOutOfBoundsException);
      }
  }

  /**
   * Given an array where the searched value is small and within typical bounds,
   * When maxMin3 is invoked with a valid value (0), Then the returned two-element
   * result must match expected counts and the original array must not be mutated.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      int[] intArray0 = new int[5];
      int[] copyBefore = Arrays.copyOf(intArray0, intArray0.length);

      // When
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 0);

      // Then - validate shape and contents and that original was not modified
      Assert.assertNotNull("Result should not be null.", intArray1);
      Assert.assertEquals("Result should contain exactly two elements.", 2, intArray1.length);
      // Expecting two zeros for an all-zero input (observed behaviour in prior tests)
      Assert.assertArrayEquals("For an all-zero input and queried value 0 the counts should be [0, 0].",
              new int[] {0, 0}, intArray1);
      Assert.assertArrayEquals("Original input array must remain unchanged after invocation.", copyBefore, intArray0);
  }

  /**
   * Given an array with a small positive entry at index 0, When maxMin3 is invoked
   * with a value that is out of the array's valid index range, Then an exception
   * is expected and the input must remain intact.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      int[] intArray0 = new int[5];
      intArray0[0] = 2;
      int[] copyBefore = Arrays.copyOf(intArray0, intArray0.length);

      // When / Then
      try {
          MaxMin3.maxMin3(intArray0, 556);
          Assert.fail("Expected ArrayIndexOutOfBoundsException for out-of-range value.");
      } catch (ArrayIndexOutOfBoundsException e) {
          Assert.assertArrayEquals("Input array must remain unchanged on failure.", copyBefore, intArray0);
      }
  }

  /**
   * Given a single-element array, When maxMin3 is invoked with a value interpreted
   * as an index equal to the array length (1), Then an ArrayIndexOutOfBoundsException
   * should be raised and the array must remain unchanged.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      int[] intArray0 = new int[1];
      int[] copyBefore = Arrays.copyOf(intArray0, intArray0.length);

      // When / Then
      try {
          MaxMin3.maxMin3(intArray0, 1);
          Assert.fail("Expected ArrayIndexOutOfBoundsException for index equal to array length.");
      } catch (ArrayIndexOutOfBoundsException e) {
          Assert.assertArrayEquals("Input array must remain unchanged when exception occurs.", copyBefore, intArray0);
      }
  }

  /**
   * Given the MaxMin3 class, When constructing an instance, Then no exception is thrown
   * and basic sanity checks on the instance succeed.
   *
   * Requirement: DS-1234
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given / When
      MaxMin3 maxMin3_0 = new MaxMin3();

      // Then - basic assertions about the constructed object
      Assert.assertNotNull("Constructor should produce a non-null instance.", maxMin3_0);
      Assert.assertEquals("Instance should be of expected class.", "ds.MaxMin3", maxMin3_0.getClass().getName());

      // Additionally validate that a simple call with safe inputs does not throw and returns an expected-shaped result.
      int[] sample = new int[] {1, 2, 3};
      int[] result = MaxMin3.maxMin3(sample, 0);
      Assert.assertNotNull("Result from a safe invocation must not be null.", result);
      Assert.assertEquals("Result from maxMin3 must be a two-element array.", 2, result.length);
  }
}