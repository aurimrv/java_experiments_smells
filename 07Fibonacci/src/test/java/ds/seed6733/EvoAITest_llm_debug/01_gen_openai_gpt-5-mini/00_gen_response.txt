package ds.seed6733;

import org.junit.Test;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

// Marker interface for categorization
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  @Before
  public void setUp() {
    // setup placeholder: keep tests independent and ready for extension
  }

  /**
   * REQ-001: Verify Fibonacci.fibIter returns expected value for a large index.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    int input = 792;
    // When
    int result = Fibonacci.fibIter(input);
    // Then
    assertEquals("fibIter(792) should return the expected overflowed int result", -489465568, result);
    assertTrue("Result should equal expected overflowed value", result == -489465568);
    // Boundary checks to improve robustness
    assertEquals("fibIter(0) should be 0", 0, Fibonacci.fibIter(0));
    assertEquals("fibIter(1) should be 1", 1, Fibonacci.fibIter(1));
  }

  /**
   * REQ-002: Verify construction of Fibonacci and basic behavior.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    Fibonacci fibonacci0 = new Fibonacci();
    assertNotNull("Fibonacci instance should be created", fibonacci0);
    // Basic sanity check for public API
    assertEquals("fibIter(0) should be 0", 0, Fibonacci.fibIter(0));
  }
}