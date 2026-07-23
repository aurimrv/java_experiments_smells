package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Focused unit tests for ds.Fibonacci
 * Requirement: REQ-001 - Correct iterative Fibonacci implementation for small inputs.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  // Given-When-Then: Given Fibonacci implementation; When computing small inputs; Then return expected values
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      // When
      int result1 = Fibonacci.fibIter(1);
      // Then
      assertEquals("fibIter(1) should return 1", 1, result1);
      // Additional boundary checks for stronger coverage
      int result0 = Fibonacci.fibIter(0);
      assertEquals("fibIter(0) should return 0", 0, result0);
      // Exceptional behavior: ensure invalid inputs are handled
      try {
          Fibonacci.fibIter(-1);
          fail("fibIter(-1) should throw IllegalArgumentException");
      } catch (IllegalArgumentException expected) {
          // expected
      }
  }

  /** Tests constructing a Fibonacci instance and basic behavior (REQ-001) */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given / When
      Fibonacci fibonacci0 = new Fibonacci();
      // Then
      assertNotNull("Fibonacci instance should be created", fibonacci0);
      // Spot-check base behavior to make the test meaningful
      assertEquals("fibIter(0) should return 0", 0, Fibonacci.fibIter(0));
  }
}