package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.lang.reflect.Method;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for MaxMin4 behavior.
 *
 * Requirement: REQ-001 - MaxMin4 should compute max/min over subarray ranges and handle invalid indices.
 *
 * These tests follow a Given-When-Then structure, provide assertions with messages, and are categorized as unit tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an array of length 6 with a set value at index 2,
   * When maxMin4 is invoked with an end index equal to the array length (an explicit boundary),
   * Then an ArrayIndexOutOfBoundsException is expected and the array should remain unchanged.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
      // Given
      int[] intArray0 = new int[6];
      intArray0[2] = 1;
      assertEquals("Precondition: array length must be 6", 6, intArray0.length);
      assertEquals("Precondition: element at index 2 set to 1", 1, intArray0[2]);

      // When / Then
      try {
          // Use an explicit boundary value (end == length) to trigger out-of-bounds access
          MaxMin4.maxMin4(intArray0, 0, intArray0.length);
          fail("Expected ArrayIndexOutOfBoundsException when end index equals array length");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Then: exception thrown and internal state unchanged
          assertEquals("Array length should remain unchanged after failed call", 6, intArray0.length);
          assertEquals("Element at index 2 should remain unchanged after exception", 1, intArray0[2]);
      }
  }

  /**
   * Given an array of length 6 with a negative value at index 0,
   * When maxMin4 is invoked with an explicit invalid end index,
   * Then an ArrayIndexOutOfBoundsException is expected and the original element remains intact.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
      // Given
      int[] intArray0 = new int[6];
      intArray0[0] = -1;
      assertEquals("Precondition: element at index 0 set to -1", -1, intArray0[0]);

      // When / Then
      try {
          // Explicitly use the array length to make the invalid index clear and reproducible
          MaxMin4.maxMin4(intArray0, 0, intArray0.length);
          fail("Expected ArrayIndexOutOfBoundsException when end index equals array length");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Additional checks to strengthen the test beyond just expecting an exception
          assertEquals("Element at index 0 should remain unchanged after exception", -1, intArray0[0]);
          assertTrue("Caught exception should be ArrayIndexOutOfBoundsException", e instanceof ArrayIndexOutOfBoundsException);
      }
  }

  /**
   * Constructor and API surface smoke test for MaxMin4.
   *
   * Verifies that an instance can be created and that the expected method signature exists.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
      // Given / When: construct an instance
      MaxMin4 maxMin4_0 = new MaxMin4();

      // Then: basic assertions about the object and available API
      assertNotNull("Constructor should return a non-null instance", maxMin4_0);
      assertEquals("Class simple name should be MaxMin4", "MaxMin4", maxMin4_0.getClass().getSimpleName());

      // Verify the expected method signature exists: maxMin4(int[], int, int)
      Method m = MaxMin4.class.getDeclaredMethod("maxMin4", int[].class, int.class, int.class);
      assertNotNull("Expected maxMin4 method with signature (int[], int, int) to be present", m);
      assertEquals("Method should accept three parameters", 3, m.getParameterCount());
  }
}