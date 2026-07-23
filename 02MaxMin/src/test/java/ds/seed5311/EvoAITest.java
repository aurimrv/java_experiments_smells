package ds.seed5311;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

import java.util.Arrays;

import static org.junit.Assert.*;

import ds.MaxMin1;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for MaxMin1.
 *
 * Each test documents the scenario using Given-When-Then style in the Javadoc and
 * includes descriptive assertions. Tests are categorized as UnitTest so they can
 * be selected or excluded during test execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Given an integer array of length 3 and a very large threshold index,
   * When maxMin1 is invoked with the oversized index,
   * Then an ArrayIndexOutOfBoundsException is expected and the input array must remain unchanged.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
      int[] input = new int[3];
      input[0] = 253;
      int[] snapshot = Arrays.copyOf(input, input.length);

      try {
          // Act
          MaxMin1.maxMin1(input, 3089);
          fail("Expected ArrayIndexOutOfBoundsException when threshold is an out-of-range large index.");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Assert: the exception type is expected and the original array must be unchanged
          assertTrue("Caught exception should be an ArrayIndexOutOfBoundsException", e instanceof ArrayIndexOutOfBoundsException);
          assertArrayEquals("Input array should remain unchanged after a thrown exception", snapshot, input);
      }
  }

  /**
   * Given an integer array containing a very large element value and an oversized threshold,
   * When maxMin1 is invoked,
   * Then the call should throw ArrayIndexOutOfBoundsException and the array's contents should be preserved.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1()  throws Throwable  {
      int[] input = new int[3];
      input[1] = 3089;
      int[] snapshot = Arrays.copyOf(input, input.length);

      try {
          // Act
          MaxMin1.maxMin1(input, 3089);
          fail("Expected ArrayIndexOutOfBoundsException when threshold is out of bounds (large index).");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Assert: exception occurred and the element that was set remains intact
          assertTrue("Expected an ArrayIndexOutOfBoundsException to be thrown", e instanceof ArrayIndexOutOfBoundsException);
          assertArrayEquals("Array content must not be modified on exception", snapshot, input);
          assertEquals("The element at index 1 should remain the assigned large value", 3089, input[1]);
      }
  }

  /**
   * Given an integer array initialized with zeros and a negative threshold,
   * When maxMin1 is invoked with a negative threshold,
   * Then the returned min/max pair must be [0,0] and the input array must remain all zeros.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
      int[] input = new int[3]; // all zeros by default

      // Act
      int[] result = MaxMin1.maxMin1(input, -420);

      // Assert basic properties of the result and that the input array hasn't been modified
      assertNotNull("Result should not be null", result);
      assertEquals("Result should contain exactly two elements (min and max)", 2, result.length);
      assertArrayEquals("Expected min and max to be zeros when all inputs are zero", new int[] {0, 0}, result);
      assertArrayEquals("Input array should remain unchanged (all zeros)", new int[] {0, 0, 0}, input);
  }

  /**
   * Given the MaxMin1 type,
   * When a new instance is constructed,
   * Then the instance must be non-null and of the expected runtime type.
   *
   * Note: MaxMin1 primarily exposes static behavior in many implementations, but constructing
   * the object should still produce a valid instance. This test documents that contract.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3()  throws Throwable  {
      // Act
      MaxMin1 instance = new MaxMin1();

      // Assert
      assertNotNull("Constructed MaxMin1 instance must not be null", instance);
      assertSame("Instance must be of type MaxMin1", MaxMin1.class, instance.getClass());
  }
}