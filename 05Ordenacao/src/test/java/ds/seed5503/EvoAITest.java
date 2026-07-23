package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.Arrays;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for Ordenacao with clearer assertions, Given-When-Then comments,
 * and coverage for both happy-path and error scenarios.
 *
 * Requirement: ORD-1 - The ordena(...) operation must preserve the multiset of elements
 * and must throw ArrayIndexOutOfBoundsException for indices outside [0, length-1].
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * Given: a variety of integer arrays and indices (valid and invalid)
   * When:  Ordenacao.ordena is invoked with those indices
   * Then:  For valid indices it should not throw and the multiset of elements must be preserved.
   *        For invalid indices it should throw ArrayIndexOutOfBoundsException.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given - a small array with distinct values
    int[] arr1 = new int[] {3, 1, 4, 1, 5, 9};
    int[] before1 = Arrays.copyOf(arr1, arr1.length);

    // When - call with a valid index (0)
    try {
      Ordenacao.ordena(arr1, 0);
    } catch (ArrayIndexOutOfBoundsException e) {
      fail("ordena should not throw for index 0 on non-empty array: " + e);
    }

    // Then - multiset (sorted contents) must be preserved and length unchanged
    assertEquals("Length must be preserved after ordena", before1.length, arr1.length);
    int[] sortedBefore1 = Arrays.copyOf(before1, before1.length);
    int[] sortedAfter1 = Arrays.copyOf(arr1, arr1.length);
    Arrays.sort(sortedBefore1);
    Arrays.sort(sortedAfter1);
    assertArrayEquals("The multiset of elements must be preserved after ordena (index 0)", sortedBefore1, sortedAfter1);

    // Given - same array again, call with valid index (last index)
    int[] arr2 = new int[] {10, -2, 7, 7, 0};
    int[] before2 = Arrays.copyOf(arr2, arr2.length);
    try {
      Ordenacao.ordena(arr2, arr2.length - 1);
    } catch (ArrayIndexOutOfBoundsException e) {
      fail("ordena should not throw for last valid index: " + e);
    }
    assertEquals("Length must be preserved after ordena (last index)", before2.length, arr2.length);
    int[] sortedBefore2 = Arrays.copyOf(before2, before2.length);
    int[] sortedAfter2 = Arrays.copyOf(arr2, arr2.length);
    Arrays.sort(sortedBefore2);
    Arrays.sort(sortedAfter2);
    assertArrayEquals("The multiset of elements must be preserved after ordena (last index)", sortedBefore2, sortedAfter2);

    // Error scenarios - invalid large positive index
    int[] arr3 = new int[9];
    arr3[0] = 3301;
    try {
      Ordenacao.ordena(arr3, 3301);
      fail("Expecting ArrayIndexOutOfBoundsException for index 3301");
    } catch (ArrayIndexOutOfBoundsException expected) {
      // Expected: index too large
      assertNotNull("Expected an ArrayIndexOutOfBoundsException instance", expected);
    }

    // Error scenarios - invalid negative index
    int[] arr4 = new int[] {1, 2, 3};
    try {
      Ordenacao.ordena(arr4, -1);
      fail("Expecting ArrayIndexOutOfBoundsException for negative index -1");
    } catch (ArrayIndexOutOfBoundsException expected) {
      // Expected: negative index not allowed
      assertNotNull("Expected an ArrayIndexOutOfBoundsException instance for negative index", expected);
    }
  }

  /**
   * Given: several representative arrays including empty and single-element arrays
   * When:  Ordenacao.ordena is invoked with appropriate indices
   * Then:  For empty array expect an out-of-range exception; for others expect no exception and multiset preservation.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Empty array: calling with index 0 should be out of bounds
    int[] empty = new int[0];
    try {
      Ordenacao.ordena(empty, 0);
      fail("Expecting ArrayIndexOutOfBoundsException for empty array and index 0");
    } catch (ArrayIndexOutOfBoundsException expected) {
      assertNotNull(expected);
    }

    // Single-element array: valid index 0, should preserve element
    int[] single = new int[] {42};
    int[] beforeSingle = Arrays.copyOf(single, single.length);
    try {
      Ordenacao.ordena(single, 0);
    } catch (ArrayIndexOutOfBoundsException e) {
      fail("ordena should not throw for single-element array with index 0: " + e);
    }
    assertArrayEquals("Single-element array must remain the same after ordena", beforeSingle, single);

    // All-zero array as in original test: validate identity and preservation
    int[] zeros = new int[8];
    Arrays.fill(zeros, 0);
    int[] beforeZeros = Arrays.copyOf(zeros, zeros.length);
    try {
      Ordenacao.ordena(zeros, 7);
    } catch (ArrayIndexOutOfBoundsException e) {
      fail("ordena should not throw for zeros array with valid index 7: " + e);
    }
    assertArrayEquals("Zeros array must remain unchanged after ordena", beforeZeros, zeros);

    // Reverse-sorted array: ensure multiset preservation for index 0 and last index
    int[] rev = new int[] {9, 7, 5, 3, 1};
    int[] beforeRev = Arrays.copyOf(rev, rev.length);
    try {
      Ordenacao.ordena(rev, 0);
    } catch (ArrayIndexOutOfBoundsException e) {
      fail("ordena should not throw for reverse-sorted array with index 0: " + e);
    }
    int[] sortedBeforeRev = Arrays.copyOf(beforeRev, beforeRev.length);
    int[] sortedAfterRev = Arrays.copyOf(rev, rev.length);
    Arrays.sort(sortedBeforeRev);
    Arrays.sort(sortedAfterRev);
    assertArrayEquals("Multiset must be preserved for reverse-sorted array (index 0)", sortedBeforeRev, sortedAfterRev);

    // Duplicate values: ensure preservation when called with last index
    int[] dup = new int[] {2, 2, 2, 1, 1};
    int[] beforeDup = Arrays.copyOf(dup, dup.length);
    try {
      Ordenacao.ordena(dup, dup.length - 1);
    } catch (ArrayIndexOutOfBoundsException e) {
      fail("ordena should not throw for duplicates array with last index: " + e);
    }
    int[] sortedBeforeDup = Arrays.copyOf(beforeDup, beforeDup.length);
    int[] sortedAfterDup = Arrays.copyOf(dup, dup.length);
    Arrays.sort(sortedBeforeDup);
    Arrays.sort(sortedAfterDup);
    assertArrayEquals("Multiset must be preserved for array with duplicates (last index)", sortedBeforeDup, sortedAfterDup);
  }

  /**
   * Given: the Ordenacao class
   * When:  it is instantiated via the public no-arg constructor
   * Then:  an instance should be created and not be null.
   *
   * This verifies basic construction and is linked to requirement ORD-ctor-1.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given / When - construct Ordenacao using public no-arg constructor
    Ordenacao instance = null;
    try {
      instance = new Ordenacao();
    } catch (Throwable t) {
      fail("Constructing Ordenacao must not throw an exception: " + t);
    }

    // Then - the instance must be non-null and of the correct runtime type
    assertNotNull("Instance of Ordenacao must not be null after construction", instance);
    assertTrue("Instance should be assignable to Ordenacao class", Ordenacao.class.isInstance(instance));
    // Sanity: ensure class has a public no-arg constructor via reflection
    try {
      assertNotNull("Ordenacao should expose a public no-arg constructor",
          Ordenacao.class.getConstructor());
    } catch (NoSuchMethodException e) {
      fail("Expected a public no-arg constructor on Ordenacao: " + e);
    }
  }
}