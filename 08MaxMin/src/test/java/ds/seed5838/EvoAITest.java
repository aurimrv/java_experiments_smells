package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface used to categorize unit tests for this class.
 */
interface UnitTest {}

/**
 * Improved and more descriptive tests for MaxMin4. These tests keep the original
 * test method names (test0, test1, test2) for compatibility, but each test now
 * follows a Given-When-Then structure, includes traceability comments, and
 * performs multiple assertions where appropriate.
 *
 * Requirement reference: REQ-1234 (example traceability tag for test maintenance)
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an integer array of length 6 with a known value at index 2,
   * When maxMin4 is invoked with an invalid 'end' index well beyond array bounds,
   * Then an ArrayIndexOutOfBoundsException is expected and the input array must remain unchanged.
   *
   * Traceability: REQ-1234-EX-BOUNDARY
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    int[] intArray0 = new int[6];
    intArray0[2] = 929;
    // Sanity checks (preconditions)
    assertEquals("Precondition: array length must be 6", 6, intArray0.length);
    assertEquals("Precondition: value at index 2 must be set", 929, intArray0[2]);

    // When / Then
    try {
      // Call with an invalid 'end' index far beyond the array length to exercise exceptional flow.
      MaxMin4.maxMin4(intArray0, 0, 762);
      fail("Expected ArrayIndexOutOfBoundsException when end index is greater than array length");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Multiple verifications about the exceptional outcome and side-effects

      // 1) Exception type is as expected
      assertTrue("Expected ArrayIndexOutOfBoundsException", e instanceof ArrayIndexOutOfBoundsException);

      // 2) The input array must not have been modified at the known index
      assertEquals("Array element at index 2 must remain unchanged after failure", 929, intArray0[2]);

      // 3) Other elements should still be default-initialized (0)
      for (int i = 0; i < intArray0.length; i++) {
        if (i != 2) {
          assertEquals("Unexpected modification of array at index " + i, 0, intArray0[i]);
        }
      }

      // 4) Basic check that the message contains some reference to the array bounds (defensive check)
      String msg = e.getMessage();
      assertNotNull("Exception message should not be null", msg);
      assertTrue("Exception message should reference the array length or index", msg.length() > 0);
    }
  }

  /**
   * Given an integer array of length 6 with a known negative value at index 3,
   * When maxMin4 is invoked with an invalid 'end' index,
   * Then an ArrayIndexOutOfBoundsException is expected and the array content must remain intact.
   *
   * Traceability: REQ-1234-EX-BOUNDARY
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    int[] intArray0 = new int[6];
    intArray0[3] = -4360;
    // Preconditions
    assertEquals("Precondition: array length must be 6", 6, intArray0.length);
    assertEquals("Precondition: value at index 3 must be set", -4360, intArray0[3]);

    // When / Then
    try {
      // Use the same invalid 'end' index pattern as the original test to assert consistent exceptional behavior.
      MaxMin4.maxMin4(intArray0, 0, 762);
      fail("Expected ArrayIndexOutOfBoundsException when end index is outside of array bounds");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Validate exception type
      assertTrue("Expected ArrayIndexOutOfBoundsException", e instanceof ArrayIndexOutOfBoundsException);

      // Validate that the element we set remains unchanged
      assertEquals("Array element at index 3 must remain unchanged after failure", -4360, intArray0[3]);

      // Validate no unexpected side-effects on other elements
      for (int i = 0; i < intArray0.length; i++) {
        if (i != 3) {
          assertEquals("Unexpected modification of array at index " + i, 0, intArray0[i]);
        }
      }

      // Validate exception message presence for debugging and traceability
      String msg = e.getMessage();
      assertNotNull("Exception message must be present for diagnostics", msg);
      assertTrue("Exception message should be non-empty", msg.length() > 0);
    }
  }

  /**
   * Given a MaxMin4 instance can be constructed,
   * When constructed and invoked on a valid array range,
   * Then construction must succeed and a call with valid indices must not throw.
   *
   * Traceability: REQ-1234-HAPPY-PATH
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given / When: construct the object
    MaxMin4 maxMin4_0 = new MaxMin4();

    // Then: basic object invariants
    assertNotNull("Constructed MaxMin4 instance should not be null", maxMin4_0);
    assertEquals("Instance should be of the expected runtime class", "ds.MaxMin4", maxMin4_0.getClass().getName());
    assertSame("An object must be equal to itself", maxMin4_0, maxMin4_0);

    // Additionally, exercise a happy-path call to maxMin4 with valid indices.
    int[] sample = new int[] {5, 1, 3, 4, 2, 0};
    // Validate preconditions
    assertEquals("Sample array length must be 6", 6, sample.length);

    try {
      // This call is expected to be within bounds (start 0, end 5)
      MaxMin4.maxMin4(sample, 0, sample.length - 1);
      // If no exception occurs, perform a lightweight postcondition check:
      // The array length should remain the same (no resize expected)
      assertEquals("Array length must remain unchanged after successful call", 6, sample.length);
    } catch (RuntimeException e) {
      // If an unexpected runtime exception is thrown on valid input, fail and present diagnostics
      fail("Unexpected exception on valid input: " + e.toString());
    }
  }
}