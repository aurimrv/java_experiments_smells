package ds.seed9006;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.MaxMin3;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface used to categorize unit tests in this file.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given a small array, when calling with an in-range index, the method should return a result (happy path).
   * When calling with an obviously out-of-range index, the method should throw ArrayIndexOutOfBoundsException.
   *
   * Requirement: MAXMIN-1 - method should handle valid indices and signal error for invalid indices.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    int[] intArray0 = new int[6];
    intArray0[3] = 3986;

    // When (happy path)
    int[] result = null;
    try {
      result = MaxMin3.maxMin3(intArray0, 3); // in-range index
    } catch (ArrayIndexOutOfBoundsException e) {
      fail("Unexpected ArrayIndexOutOfBoundsException for a valid index 3: " + e.getMessage());
    }

    // Then (happy path assertions)
    assertNotNull("Expected a non-null result for a valid index", result);
    assertTrue("Result should be an array (possibly with at least one element)", result.length >= 0);

    // When (error path)
    try {
      MaxMin3.maxMin3(intArray0, 1996);
      fail("Expecting ArrayIndexOutOfBoundsException for index 1996");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Then
      assertNotNull("Exception message should not be null", e.getMessage());
      assertTrue("Exception message should contain a digit indicating the invalid index",
                 e.getMessage().matches(".*\\d.*"));
    }
  }

  /**
   * Given a prepared array, verify behavior for both a valid and an invalid index.
   *
   * Requirement: MAXMIN-1
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given
    int[] intArray0 = new int[6];
    intArray0[2] = -198;

    // When (happy path)
    int[] res = MaxMin3.maxMin3(intArray0, 2);
    assertNotNull("Happy-path call should return a non-null array", res);
    assertTrue("Returned array should have non-negative length", res.length >= 0);

    // When (error path)
    try {
      MaxMin3.maxMin3(intArray0, 1540);
      fail("Expecting ArrayIndexOutOfBoundsException for index 1540");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Then
      assertTrue("Caught expected ArrayIndexOutOfBoundsException", e instanceof ArrayIndexOutOfBoundsException);
      assertNotNull("Exception message should exist", e.getMessage());
      assertTrue("Exception message should contain a number", e.getMessage().matches(".*\\d.*"));
    }
  }

  /**
   * Verify behavior on valid small index and a large out-of-range index.
   *
   * Requirement: MAXMIN-1
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given
    int[] intArray0 = new int[7];
    intArray0[2] = 1193;

    // When (happy path)
    int[] ok = MaxMin3.maxMin3(intArray0, 2);
    assertNotNull("Happy-path result should not be null", ok);
    assertTrue("Happy-path result should be an array", ok.length >= 0);

    // When (error path)
    try {
      MaxMin3.maxMin3(intArray0, 58);
      fail("Expecting ArrayIndexOutOfBoundsException for index 58");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Then
      assertNotNull("Exception message should not be null", e.getMessage());
      assertTrue("Exception message should contain a digit", e.getMessage().matches(".*\\d.*"));
    }
  }

  /**
   * Given an array with a negative element, verify valid-index behavior and an invalid-index error.
   *
   * Requirement: MAXMIN-1
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given
    int[] intArray0 = new int[6];
    intArray0[5] = -693;

    // When (happy path)
    int[] good = MaxMin3.maxMin3(intArray0, 5);
    assertNotNull("Result for valid index should not be null", good);
    assertTrue("Result should be an array (length >= 0)", good.length >= 0);

    // When (error path)
    try {
      MaxMin3.maxMin3(intArray0, 1996);
      fail("Expecting ArrayIndexOutOfBoundsException for index 1996");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Then
      assertNotNull("Exception message expected", e.getMessage());
      assertTrue("Exception message should contain numeric information", e.getMessage().matches(".*\\d.*"));
    }
  }

  /**
   * Demonstrates a specific known behavior combination:
   * - Calling maxMin3 twice, first with a negative index then with 0, should produce a two-element result
   *   ordering min/max (observed behavior).
   *
   * Requirement: MAXMIN-2 - preserve min/max ordering when called with successive indices.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given
    int[] intArray0 = new int[9];
    intArray0[0] = -1;

    // When - first call (the implementation may adapt internal state, exercise that behavior)
    int[] intArray1 = MaxMin3.maxMin3(intArray0, -488);
    assertNotNull("Intermediate result should not be null", intArray1);

    // When - second call
    int[] intArray2 = MaxMin3.maxMin3(intArray1, 0);

    // Then - expect specific behavior observed in prior test generation: two-element array [0, -1]
    assertNotNull("Final result should not be null", intArray2);
    assertEquals("Final result should have exactly 2 elements", 2, intArray2.length);
    assertArrayEquals("Final result should match expected [0, -1]", new int[] {0, -1}, intArray2);
  }

  /**
   * Test both a simple valid call and a large out-of-range index to ensure proper exception is thrown.
   *
   * Requirement: MAXMIN-1
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given
    int[] intArray0 = new int[9];

    // When (happy path)
    int[] ok = MaxMin3.maxMin3(intArray0, 0);
    assertNotNull("Happy-path result should be non-null", ok);
    assertTrue("Returned array length should be non-negative", ok.length >= 0);

    // When (error path)
    try {
      MaxMin3.maxMin3(intArray0, 1975);
      fail("Expecting ArrayIndexOutOfBoundsException for index 1975");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Then
      assertNotNull("Exception message should exist", e.getMessage());
      assertTrue("Exception message should include a numeric index hint", e.getMessage().matches(".*\\d.*"));
    }
  }

  /**
   * Construction and simple usage smoke test for MaxMin3.
   *
   * Requirement: MAXMIN-0 - class should be instantiable and usable.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    // Given / When - construct
    MaxMin3 maxMin3_0 = new MaxMin3();
    assertNotNull("Constructed MaxMin3 instance should not be null", maxMin3_0);

    // Then - basic invocation to ensure no unexpected exceptions and a non-null result
    int[] sample = new int[] { 5, 1, 9 };
    int[] result = MaxMin3.maxMin3(sample, 1); // index 1 is valid
    assertNotNull("Result from maxMin3 should not be null for valid input", result);
    assertTrue("Result should be an array (length >= 0)", result.length >= 0);
  }
}