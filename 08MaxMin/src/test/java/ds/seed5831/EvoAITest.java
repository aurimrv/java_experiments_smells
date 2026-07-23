package ds.seed5831;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin4.
 *
 * Traceability:
 * - REQ-001: maxMin4 must throw IndexOutOfBounds for out-of-range indices.
 * - REQ-002: maxMin4 must succeed for valid ranges and return a non-null result.
 * - REQ-003: MaxMin4 should be instantiable.
 *
 * These tests follow a Given-When-Then structure and include assertions that
 * verify both exceptional and normal behaviors and that the input arrays are
 * not unexpectedly mutated when an exception is thrown.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given an array of length 8 with a populated element,
   * When calling MaxMin4.maxMin4 with a 'to' index that is far out of bounds,
   * Then an ArrayIndexOutOfBoundsException is expected and the original array
   * contents must remain unchanged.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    int[] intArray0 = new int[8];
    intArray0[2] = 2887;

    // When / Then
    try {
      MaxMin4.maxMin4(intArray0, 0, 3137);
      fail("Expected ArrayIndexOutOfBoundsException when 'to' is well past array length");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Verify array was not mutated except as initially set
      assertEquals("Value at index 2 should remain unchanged after failing call", 2887, intArray0[2]);
      // basic sanity on array length
      assertEquals("Array length should remain 8", 8, intArray0.length);
    }
  }

  /**
   * Given an array containing a negative value at index 0,
   * When calling MaxMin4.maxMin4 with an extremely large 'to' index,
   * Then an ArrayIndexOutOfBoundsException is expected.
   *
   * Additionally: calling maxMin4 with a valid range should complete and
   * return a non-null result (no assertion about exact content, as behavior
   * is implementation-specific).
   *
   * Requirement: REQ-002
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    int[] intArray0 = new int[8];
    intArray0[0] = -1;

    // When / Then: out-of-bounds 'to' should throw
    try {
      MaxMin4.maxMin4(intArray0, 0, 3137);
      fail("Expected ArrayIndexOutOfBoundsException when 'to' is far out of bounds");
    } catch (ArrayIndexOutOfBoundsException e) {
      // Verify array content preserved
      assertEquals("Value at index 0 should remain -1 after failing call", -1, intArray0[0]);
      assertEquals("Array length should remain 8", 8, intArray0.length);
    }

    // And: when called with a valid range, the method should complete and return a non-null result
    try {
      Method m = MaxMin4.class.getMethod("maxMin4", int[].class, int.class, int.class);
      Object result = m.invoke(null, intArray0, 0, intArray0.length - 1);
      assertNotNull("Expected non-null result from maxMin4 for a valid range", result);

      // If result is an array, it should have positive length
      if (result.getClass().isArray()) {
        int len = Array.getLength(result);
        assertTrue("Result array should have positive length", len > 0);
      }
      // If result is a Number (primitive int boxed), just ensure it's a valid number (no-op assertion here)
      // Additional content assertions would be added if contract were specified.
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      fail("Reflection invocation of maxMin4 failed: " + e);
    }
  }

  /**
   * Given the MaxMin4 class,
   * When constructing an instance,
   * Then the instance should be created and be of the correct type.
   *
   * Requirement: REQ-003
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given / When: instantiate MaxMin4 using no-arg constructor
    MaxMin4 instance = null;
    try {
      instance = new MaxMin4();
    } catch (Throwable t) {
      fail("Construction of MaxMin4 should not throw: " + t);
    }

    // Then: basic assertions about the created object
    assertNotNull("MaxMin4 instance should not be null after construction", instance);
    assertTrue("Constructed object should be instance of MaxMin4", instance instanceof MaxMin4);

    // Also verify a no-arg constructor exists and is invokable via reflection
    try {
      MaxMin4 reflectInstance = MaxMin4.class.getConstructor().newInstance();
      assertNotNull("Reflectively constructed MaxMin4 should not be null", reflectInstance);
    } catch (NoSuchMethodException nsme) {
      fail("MaxMin4 should have a public no-arg constructor: " + nsme);
    } catch (Exception e) {
      fail("Reflective construction failed: " + e);
    }
  }
}