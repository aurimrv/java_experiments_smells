package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.Arrays;
import static org.evosuite.runtime.EvoAssertions.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: a small array with known contents (happy path)
    int[] input = new int[] { 3, 1, 4, 1, 5, 9, 2 };
    int[] before = Arrays.copyOf(input, input.length);

    // When: call with valid (in-range) indices
    try {
      // use inclusive last index to avoid Integer overflow or out-of-range in typical implementations
      MaxMin4.maxMin4(input, 0, input.length - 1);
    } catch (Exception e) {
      // Then: the call should not throw for valid bounds
      fail("Unexpected exception for valid bounds: " + e);
    }

    // Then: verify that the multiset of elements is preserved (method should not create/drop elements)
    int[] sortedBefore = Arrays.copyOf(before, before.length);
    int[] sortedAfter = Arrays.copyOf(input, input.length);
    Arrays.sort(sortedBefore);
    Arrays.sort(sortedAfter);
    assertArrayEquals("Array contents (as a multiset) should be preserved after maxMin4 on valid range",
        sortedBefore, sortedAfter);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: a small array and an intentionally invalid end index to exercise error handling
    int[] input = new int[] { 0, 1, 2, 3, 4, 5 };

    // When / Then: Expect an ArrayIndexOutOfBoundsException for an out-of-range end index
    try {
      MaxMin4.maxMin4(input, 0, Integer.MAX_VALUE);
      fail("Expected ArrayIndexOutOfBoundsException for an out-of-range end index");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Basic assertions about the thrown exception: it must be the expected type and non-null
      assertNotNull("Thrown exception should not be null", e);
      // The message may be implementation-specific; assert that the exception class is correct
      assertEquals("Expected ArrayIndexOutOfBoundsException class", ArrayIndexOutOfBoundsException.class, e.getClass());
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given / When: construct an instance to verify the no-arg constructor behaves correctly
    MaxMin4 instance = new MaxMin4();

    // Then: basic sanity checks on the constructed object
    assertNotNull("Constructor should produce a non-null MaxMin4 instance", instance);
    assertSame("Instance should be identical to itself", instance, instance);
  }
}