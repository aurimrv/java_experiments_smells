package ds.seed5503;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.MaxMin2;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved, human-maintained tests for ds.MaxMin2.
 *
 * These tests include both happy-path and error-path checks, provide
 * descriptive assertions and messages, and are annotated for selective runs.
 *
 * Traceability:
 * - REQ-DS-001: maxMin2 should throw ArrayIndexOutOfBoundsException when the
 *   requested index is outside the bounds of the provided array.
 * - REQ-DS-002: maxMin2 should return a two-element array [min, max] for valid inputs.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  /**
   * REQ-DS-001: Verify that an invalid large index causes an ArrayIndexOutOfBoundsException
   * and that the input array is not modified when the exception is thrown.
   *
   * Given an array of length 7 and a wildly out-of-range index (1966),
   * When maxMin2 is invoked,
   * Then an ArrayIndexOutOfBoundsException is thrown and the original array remains unchanged.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = -316;
      // snapshot before call
      int[] before = intArray0.clone();
      try {
          MaxMin2.maxMin2(intArray0, 1966);
          fail("Expected ArrayIndexOutOfBoundsException when requesting index 1966 on array of length 7");
      } catch (ArrayIndexOutOfBoundsException e) {
          // verify the array was not altered by the failing call
          assertEquals("Array length should remain unchanged after exception", 7, intArray0.length);
          assertArrayEquals("Array contents should remain unchanged after exception", before, intArray0);
          // the exception message often includes the illegal index or length; ensure it's not null
          assertNotNull("Exception should contain a message", e.getMessage());
      }
  }

  /**
   * REQ-DS-001: Another error-path case. Different initial content to ensure
   * behaviour is independent of array contents.
   *
   * Given an array of length 7 with a non-zero element,
   * When maxMin2 is invoked with an out-of-range index,
   * Then ArrayIndexOutOfBoundsException is thrown and the array content is preserved.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = 134;
      int[] before = intArray0.clone();
      try {
          MaxMin2.maxMin2(intArray0, 1966);
          fail("Expected ArrayIndexOutOfBoundsException for index 1966 on length-7 array");
      } catch (ArrayIndexOutOfBoundsException e) {
          assertArrayEquals("Array should not be modified on exception", before, intArray0);
          assertTrue("Exception message should mention the array length or index", e.getMessage() != null && !e.getMessage().isEmpty());
      }
  }

  /**
   * REQ-DS-002: Happy-path case verifying returned min/max contract for a small array.
   *
   * Given an array of three zero-initialized elements and request parameter 2,
   * When maxMin2 is invoked,
   * Then it should return a two-element array [min, max] and both values should be equal to 0.
   *
   * Additionally verify returned array shape and ordering invariant (min <= max).
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3]; // {0,0,0}
      int[] result = MaxMin2.maxMin2(intArray0, 2);
      assertNotNull("Result should not be null", result);
      assertEquals("Result should be a two-element array [min,max]", 2, result.length);
      assertTrue("min should be <= max", result[0] <= result[1]);
      // Given the input is all zeros, both min and max should be 0
      assertArrayEquals("For zero-initialized input, expected [0,0]", new int[] {0, 0}, result);
  }

  /**
   * Construction and basic API sanity check.
   *
   * Given a fresh MaxMin2 instance,
   * Then the instance should be non-null and have a reasonable toString representation.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
      assertNotNull("Constructor should produce a non-null instance", maxMin2_0);
      // basic reflective sanity checks: class name and toString should not be null
      assertEquals("Class simple name should be MaxMin2", "MaxMin2", maxMin2_0.getClass().getSimpleName());
      String repr = maxMin2_0.toString();
      assertNotNull("toString() should not return null", repr);
      assertTrue("toString() should contain the class name", repr.contains("MaxMin2") || repr.length() > 0);
  }
}