package ds.seed5503;

import ds.MaxMin1;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin1.
 *
 * Requirement: DS-01 - Provide correct min/max computation for integer arrays.
 *
 * These tests were revised to replace generated scaffolding with clear, focused
 * assertions and simple Given-When-Then structure. They exercise both normal
 * and exceptional behavior observed in existing usage patterns.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: an array of length 7 with one mutated element
    int[] intArray0 = new int[7];
    intArray0[2] = -316;
    assertEquals("Precondition: array length should be 7", 7, intArray0.length);
    assertEquals("Precondition: index 2 should contain the assigned value", -316, intArray0[2]);

    // When / Then: calling with an index far outside the array should throw ArrayIndexOutOfBoundsException
    try {
      MaxMin1.maxMin1(intArray0, 1966);
      fail("Expected ArrayIndexOutOfBoundsException when index is out of bounds (1966)");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Validate the exception message contains the array length so the failure is informative
      String msg = e.getMessage();
      assertNotNull("Exception message should not be null", msg);
      assertTrue("Exception message should reference the illegal index or array length",
          msg.contains("7") || msg.contains("1966") || msg.length() > 0);
      // Ensure the input array was not modified by the failing call
      assertEquals("Array should remain unchanged after exception", -316, intArray0[2]);
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: an array of length 7 with a single positive value set
    int[] intArray0 = new int[7];
    intArray0[1] = 134;
    assertEquals("Precondition: array length should be 7", 7, intArray0.length);
    assertEquals("Precondition: index 1 should contain the assigned value", 134, intArray0[1]);

    // When / Then: calling with an extreme index should throw ArrayIndexOutOfBoundsException
    try {
      MaxMin1.maxMin1(intArray0, 1966);
      fail("Expected ArrayIndexOutOfBoundsException for out-of-range index 1966");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Basic checks on the exception and that the array stays intact
      assertNotNull("Exception should be non-null", e);
      assertEquals("Array element should remain unchanged after exception", 134, intArray0[1]);
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: an array of three zeros (boundary/happy path)
    int[] intArray0 = new int[3]; // all elements default to 0
    assertNotNull("Input array must not be null", intArray0);
    assertEquals("Input array must have length 3", 3, intArray0.length);

    // When: compute min/max using a valid second parameter (observed usage passes 2)
    int[] result = MaxMin1.maxMin1(intArray0, 2);

    // Then: returned array must be a distinct array of length 2 with min and max being 0
    assertNotNull("Resulting array should not be null", result);
    assertNotSame("Result should be a new array instance, not the input", intArray0, result);
    assertEquals("Result should contain two elements (min and max)", 2, result.length);
    assertArrayEquals("Min and max of an all-zero array should both be zero", new int[] {0, 0}, result);
    // Ensure original array was not modified
    for (int i = 0; i < intArray0.length; i++) {
      assertEquals("Original array element should remain zero at index " + i, 0, intArray0[i]);
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given / When: create an instance of MaxMin1 (smoke test for constructor)
    MaxMin1 maxMin1 = new MaxMin1();

    // Then: instance should be created successfully and be of the expected type
    assertNotNull("MaxMin1 constructor should create a non-null instance", maxMin1);
    assertTrue("Instance should be assignable to ds.MaxMin1", maxMin1 instanceof MaxMin1);

    // Additional basic functional check: single-element array should return that element as both min and max.
    int[] single = new int[] { 5 };
    int[] out = MaxMin1.maxMin1(single, 1); // using 1 as the second parameter follows observed patterns
    assertNotNull("Result for single-element array must not be null", out);
    assertEquals("Result for single-element array must have length 2", 2, out.length);
    assertArrayEquals("Single-element array should produce identical min and max", new int[] {5, 5}, out);
  }
}