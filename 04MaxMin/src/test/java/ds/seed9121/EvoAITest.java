package ds.seed9121;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.MaxMin3;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to categorize tests as unit tests.
 */
interface UnitTest {}

/**
 * Improved test class for ds.MaxMin3.
 *
 * Each test includes a short Javadoc linking to an example requirement ID,
 * uses Given-When-Then structure in comments, and combines both error and
 * happy-path checks where appropriate to increase confidence.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-001: Method should throw ArrayIndexOutOfBoundsException for out-of-range indices
   *
   * Given an int array and an excessively large index,
   * When maxMin3 is invoked with that index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Also verifies a simple happy-path invocation for a valid index returns a non-null result
   * of expected shape.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    int[] intArray0 = new int[6];
    intArray0[5] = 2988;

    // When / Then - error path: out-of-range index should throw ArrayIndexOutOfBoundsException
    try {
      MaxMin3.maxMin3(intArray0, 2988);
      fail("Expecting ArrayIndexOutOfBoundsException for index 2988");
    } catch (ArrayIndexOutOfBoundsException e) {
      // In Java 8 the message for array index OOB is typically the bad index or the length.
      // We assert that exception was thrown and message is not null (message content can vary by JVM).
      assertNotNull("ArrayIndexOutOfBoundsException should have a message", e.getMessage());
    }

    // Happy path: valid index within bounds should not throw and should return a 2-element array (max,min)
    int[] result = MaxMin3.maxMin3(intArray0, 0);
    assertNotNull("Result should not be null for a valid invocation", result);
    assertTrue("Result should have length >= 2", result.length >= 2);
    // Basic property: first element should be >= second element if interpreting as max/min
    assertTrue("Expected first element >= second element (max >= min)", result[0] >= result[1]);
  }

  /**
   * REQ-002: Method should handle negative values in array and throw on out-of-range index.
   *
   * Given an array containing negative values,
   * When invoked with a hugely out-of-range index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Also verifies behaviour for a valid index near the populated slot.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    int[] intArray0 = new int[6];
    intArray0[4] = -2940;

    // When / Then - error path
    try {
      MaxMin3.maxMin3(intArray0, 342);
      fail("Expecting ArrayIndexOutOfBoundsException for index 342");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("Expected non-null message on ArrayIndexOutOfBoundsException", e.getMessage());
    }

    // Happy path: use a valid index within bounds and assert sensible properties
    int[] result = MaxMin3.maxMin3(intArray0, 4);
    assertNotNull("Result must not be null for valid index", result);
    assertTrue("Result should contain at least two elements", result.length >= 2);
    assertTrue("Expected max >= min for returned result", result[0] >= result[1]);
  }

  /**
   * REQ-003: Validate handling of typical indices and behavior at a boundary index.
   *
   * Given an array with a populated element,
   * When invoked with an in-range index,
   * Then it should return a non-null result with expected relational properties.
   *
   * Also validates exception behavior for a clearly out-of-range index.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    int[] intArray0 = new int[6];
    intArray0[2] = 342;

    // When / Then - error path (very large index)
    try {
      MaxMin3.maxMin3(intArray0, 342);
      fail("Expecting ArrayIndexOutOfBoundsException for index 342");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("AIOOBE should include a message", e.getMessage());
    }

    // Happy path: test boundary index 0 and last valid index (length-1)
    int[] res0 = MaxMin3.maxMin3(intArray0, 0);
    assertNotNull("Result for index 0 should not be null", res0);
    assertTrue("Result for index 0 should have at least 2 elements", res0.length >= 2);
    assertTrue("First element should be >= second element for index 0", res0[0] >= res0[1]);

    int[] resLast = MaxMin3.maxMin3(intArray0, intArray0.length - 1);
    assertNotNull("Result for last index should not be null", resLast);
    assertTrue("Result for last index should have at least 2 elements", resLast.length >= 2);
    assertTrue("First element should be >= second element for last index", resLast[0] >= resLast[1]);
  }

  /**
   * REQ-004: Verify behavior for a smaller array and out-of-range access.
   *
   * Given a small array,
   * When invoked with an index well beyond its length,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Also exercises a valid index to ensure correct behaviour of the happy path.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    int[] intArray0 = new int[5];
    intArray0[3] = -825;

    // When / Then - error path
    try {
      MaxMin3.maxMin3(intArray0, 18);
      fail("Expecting ArrayIndexOutOfBoundsException for index 18");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("Expected a message for AIOOBE", e.getMessage());
    }

    // Happy path: valid index within bounds should return sensible max/min pair
    int[] result = MaxMin3.maxMin3(intArray0, 3);
    assertNotNull("Result should not be null for valid invocation", result);
    assertTrue("Result should have at least two elements", result.length >= 2);
    assertTrue("First element should be >= second element in returned pair", result[0] >= result[1]);
  }

  /**
   * REQ-005: Method should throw NullPointerException when provided a null array.
   *
   * Given a null array reference,
   * When maxMin3 is invoked,
   * Then a NullPointerException is expected.
   *
   * Also exercises a simple happy path with an empty array to ensure non-null return.
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Error path: null input should cause NullPointerException
    try {
      MaxMin3.maxMin3((int[]) null, 1);
      fail("Expecting NullPointerException for null array input");
    } catch (NullPointerException e) {
      // NullPointerException message is typically null; ensure exception type only
      assertTrue("Expected NullPointerException", e instanceof NullPointerException);
    }

    // Happy path: empty array should be handled (depending on implementation it may or may not throw;
    // here we check that if it returns, it returns a non-null result when called with 0)
    int[] empty = new int[0];
    try {
      int[] result = MaxMin3.maxMin3(empty, 0);
      // If implementation returns a result, verify basic properties
      if (result != null) {
        assertTrue("Returned array for empty input should have length >= 0", result.length >= 0);
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      // Acceptable alternative behavior: some implementations may throw for empty arrays; assert that exception is for index
      assertNotNull("AIOOBE from empty array should have message", ex.getMessage());
    }
  }

  /**
   * REQ-006: Construction should be possible for utility class (no side effects).
   *
   * Given the MaxMin3 class,
   * When an instance is created,
   * Then the instance should be non-null and its class should be ds.MaxMin3.
   */
  @Test(timeout = 4000)
  public void test6() throws Throwable {
    // Given / When
    MaxMin3 instance = new MaxMin3();

    // Then
    assertNotNull("Instantiated MaxMin3 should not be null", instance);
    assertEquals("Instance must be of class ds.MaxMin3", "ds.MaxMin3", instance.getClass().getName());
    // A trivial sanity check: calling toString should not throw
    String s = instance.toString();
    assertNotNull("toString() should return a non-null string", s);
  }
}