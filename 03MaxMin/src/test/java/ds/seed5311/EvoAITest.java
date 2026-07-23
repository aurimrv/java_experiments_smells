package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Test class for MaxMin2 utility.
 *
 * Intent:
 * - Validate correct behavior on valid inputs (happy path).
 * - Validate robust handling of invalid index inputs (error paths).
 *
 * Requirement traceability: REQ-INDEX-BOUNDS, REQ-RESULT-STRUCTURE
 *
 * Each test follows a Given-When-Then structure in comments and includes
 * descriptive assertion messages to aid debugging.
 */
public class EvoAITest {

  /**
   * Given an int array of length 3 with a value at index 0,
   * When maxMin2 is invoked with an index far outside the upper bound,
   * Then an ArrayIndexOutOfBoundsException is expected and the original array must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    int[] input = new int[3];
    input[0] = 253;
    int original0 = input[0];
    int original1 = input[1];
    int original2 = input[2];

    // When / Then: expect ArrayIndexOutOfBoundsException for an out-of-range index
    try {
      MaxMin2.maxMin2(input, 3089);
      fail("Expected ArrayIndexOutOfBoundsException when calling maxMin2 with index 3089 (array length 3)");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Then: verify the array was not modified and exception details are sensible
      assertEquals("Element at index 0 should remain unchanged after failed call", original0, input[0]);
      assertEquals("Element at index 1 should remain unchanged after failed call", original1, input[1]);
      assertEquals("Element at index 2 should remain unchanged after failed call", original2, input[2]);
      assertNotNull("Caught exception must contain a stack trace", e.getStackTrace());
      assertTrue("Caught exception must be an instance of ArrayIndexOutOfBoundsException",
                 e instanceof ArrayIndexOutOfBoundsException);
    }
  }

  /**
   * Given an int array of length 3 with a large value at index 1,
   * When maxMin2 is invoked with an index far outside the upper bound,
   * Then an ArrayIndexOutOfBoundsException is expected and the original array must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    int[] input = new int[3];
    input[1] = 3089;
    int original0 = input[0];
    int original1 = input[1];
    int original2 = input[2];

    // When / Then: expect ArrayIndexOutOfBoundsException for an out-of-range index
    try {
      MaxMin2.maxMin2(input, 3089);
      fail("Expected ArrayIndexOutOfBoundsException when calling maxMin2 with index 3089 (array length 3)");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Then: verify the array was not modified and exception details are sensible
      assertEquals("Element at index 0 should remain unchanged after failed call", original0, input[0]);
      assertEquals("Element at index 1 should remain unchanged after failed call", original1, input[1]);
      assertEquals("Element at index 2 should remain unchanged after failed call", original2, input[2]);
      assertNotNull("Caught exception must contain a stack trace", e.getStackTrace());
      assertTrue("Caught exception must be an instance of ArrayIndexOutOfBoundsException",
                 e instanceof ArrayIndexOutOfBoundsException);
    }
  }

  /**
   * Given a zero-filled int array of length 3,
   * When maxMin2 is invoked with a negative index parameter,
   * Then the method should return an array of length 2 representing {min, max} and the values should be consistent.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    int[] input = new int[3]; // {0,0,0}

    // When
    int[] result = MaxMin2.maxMin2(input, -420);

    // Then: basic structure and content checks
    assertNotNull("Result array should not be null", result);
    assertEquals("Result array should contain exactly two elements (min and max)", 2, result.length);
    assertArrayEquals("Result should represent min and max for the input array", new int[] {0, 0}, result);

    // Additional invariants: min <= max, values consistent with expected min and max
    int min = result[0];
    int max = result[1];
    assertTrue("Invariant: min should be less than or equal to max", min <= max);
    assertEquals("Expected min to be 0 for an all-zero array", 0, min);
    assertEquals("Expected max to be 0 for an all-zero array", 0, max);
  }

  /**
   * Given the MaxMin2 type,
   * When a new instance is constructed,
   * Then the instance should be creatable and its runtime class should match MaxMin2.class.
   *
   * This test ensures the class has an accessible no-arg constructor and can be instantiated,
   * which supports basic use in client code and further testing scenarios.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given / When
    MaxMin2 instance = new MaxMin2();

    // Then
    assertNotNull("A new MaxMin2 instance should not be null", instance);
    assertEquals("The runtime class of the instance should be MaxMin2.class", MaxMin2.class, instance.getClass());
  }
}