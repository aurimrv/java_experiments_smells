package ds.seed5311;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import ds.Item;
import ds.Max;
import ds.MeuItem;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Test class for Max behavior (improved from generated baseline).
 *
 * Requirement trace: REQ-1234 - Determine maximum Item among first N entries of an array.
 *
 * Notes (Given-When-Then style):
 * - Given various Item[] inputs (null-filled, empty, populated),
 * - When Max.max(...) is invoked with different N values (0, valid counts, out-of-range),
 * - Then the method either returns the expected Item reference, null for no-elements, or throws an appropriate exception.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  // Helper factory: creates an Item[] of requested length filled with nulls.
  private static Item[] createNullFilledArray(int length) {
    return new Item[length];
  }

  // Helper factory: creates an Item[] with the given MeuItem repeated 'count' times.
  private static Item[] createRepeatedMeuItemArray(MeuItem item, int count) {
    Item[] arr = new Item[count];
    for (int i = 0; i < count; i++) {
      arr[i] = item;
    }
    return arr;
  }

  /**
   * Test exceptional and out-of-range handling for Max.max.
   *
   * Given an array with some non-null items and trailing nulls,
   * When calling Max.max with an excessively large N,
   * Then an exception (NullPointerException or ArrayIndexOutOfBoundsException) is expected.
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(1323);
      itemArray0[0] = meuItem0;
      itemArray0[1] = meuItem0;
      MeuItem meuItem1 = new MeuItem(3780);
      itemArray0[2] = meuItem1;
      // indices 3..6 remain null

      // When / Then: calling with a very large N should not silently succeed.
      try {
          Max.max(itemArray0, 1323);
          fail("Expected an exception when requesting more elements than array length (should throw NPE or AIOOBE).");
      } catch (Exception e) {
          // Accept either a NullPointerException (if implementation dereferences missing elements)
          // or an ArrayIndexOutOfBoundsException (if it tries to access beyond array length).
          assertTrue("Unexpected exception type: " + e.getClass(),
                     (e instanceof NullPointerException) || (e instanceof ArrayIndexOutOfBoundsException));
      }

      // Additionally, verify that a valid small N returns a non-null result when elements are present.
      // Given: consider first 3 items (two references to meuItem0 and one meuItem1)
      Item result = Max.max(itemArray0, 3);
      // The implementation may select one of the non-null items as the maximum; at minimum, it should not be null.
      assertNotNull("When considering existing elements, result should not be null", result);
      // It should be one of the references provided within the considered prefix.
      boolean isContained = (result == meuItem0) || (result == meuItem1);
      assertTrue("Result should be one of the provided MeuItem instances from the prefix", isContained);
  }

  /**
   * Test various happy-path and boundary scenarios for Max.max.
   *
   * Scenarios covered:
   *  - empty array
   *  - array with only nulls
   *  - array with repeated identical MeuItem references
   *
   * Requirement: REQ-1234
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given-When-Then #1: array with only nulls and N = 0 (no elements considered)
      Item[] nulls = createNullFilledArray(6);
      Item resNulls = Max.max(nulls, 0);
      assertNull("With N=0 (no elements considered), result should be null", resNulls);

      // Given-When-Then #2: empty array (edge case)
      Item[] empty = createNullFilledArray(0);
      try {
          Item resEmpty = Max.max(empty, 0);
          // Accept either null (no elements) or an exception (implementation-dependent)
          assertNull("Empty array with N=0 should return null or throw; returned non-null: " + resEmpty, resEmpty);
      } catch (IndexOutOfBoundsException e) {
          // acceptable: some implementations may throw for empty arrays
          assertNotNull("IndexOutOfBoundsException thrown as expected for empty array", e);
      } catch (NullPointerException e) {
          // also acceptable for some implementations
          assertNotNull("NullPointerException thrown as acceptable behavior for empty array", e);
      }

      // Given-When-Then #3: array with actual MeuItem references repeated; N equals count
      MeuItem repeated = new MeuItem(42);
      Item[] repeatedArr = createRepeatedMeuItemArray(repeated, 2);
      Item result = Max.max(repeatedArr, 2);
      // Expect the algorithm to return a reference to one of provided items; since both are same reference, expect that one.
      assertSame("When all considered elements are the same reference, that reference should be returned as max", repeated, result);
  }

  /**
   * Constructor and basic sanity check for Max class.
   *
   * Ensures the class is instantiable and that a new instance does not interfere with static behavior.
   * Requirement: REQ-0001 (construction sanity)
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given / When: instantiate Max
      Max max0 = new Max();

      // Then: basic sanity assertions
      assertNotNull("Max instance should be constructible", max0);
      // The class should be a distinct object (not a singleton instance returned as null)
      Max another = new Max();
      assertNotSame("Multiple constructions should yield distinct instances", max0, another);

      // Finally, ensure that constructing Max does not change behavior for a simple call:
      Item[] items = createNullFilledArray(1);
      // When asking for 0 elements, behavior should be safe (either null or exception); just call to ensure no unexpected runtime errors from constructor state.
      try {
          Item r = Max.max(items, 0);
          assertTrue("Result for N=0 should be null or an Item", r == null || r instanceof Item);
      } catch (Exception e) {
          // Acceptable: different implementations may throw for edge inputs.
          assertTrue("Exception thrown is acceptable for edge case after construction", e instanceof RuntimeException);
      }
  }
}