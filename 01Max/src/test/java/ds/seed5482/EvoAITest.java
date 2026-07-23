package ds.seed5482;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for Max behavior.
 *
 * Requirement traceability: REQ-001: "Max selection and defensive behavior for null/empty inputs"
 *
 * Notes:
 * - These tests exercise both happy-path and exceptional behavior observed in the original suite.
 * - Tests follow Given-When-Then and provide descriptive assertion messages to aid diagnosis.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Helper to create an Item[] of a given length and to populate
   * specified positions with MeuItem instances carrying the supplied values.
   */
  private Item[] createItemArray(int length, int[][] indexValuePairs) {
    Item[] arr = new Item[length];
    if (indexValuePairs != null) {
      for (int[] pair : indexValuePairs) {
        if (pair != null && pair.length >= 2) {
          int idx = pair[0];
          int val = pair[1];
          if (idx >= 0 && idx < length) {
            arr[idx] = new MeuItem(val);
          }
        }
      }
    }
    return arr;
  }

  /**
   * Given an array with some null slots and two initialized items,
   * When max(...) is invoked with an out-of-range/large second parameter,
   * Then a NullPointerException is expected because the implementation
   * traverses null entries (observed behavior in original suite).
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Item[] itemArray0 = createItemArray(9, new int[][] { {0, 0}, {1, 560} });
      Assert.assertEquals("Array length should be 9", 9, itemArray0.length);
      Assert.assertNotNull("Slot 0 should be populated", itemArray0[0]);
      Assert.assertNotNull("Slot 1 should be populated", itemArray0[1]);
      Assert.assertNull("Slot 2 should be null (intentional sparse array for test)", itemArray0[2]);

      // When / Then - expect NullPointerException due to null entries encountered by Max.max
      try {
        Max.max(itemArray0, 560);
        Assert.fail("Expected NullPointerException when calling Max.max with sparse array and large second parameter");
      } catch (NullPointerException e) {
        // Verify that the thrown exception is indeed a NullPointerException and has no message (consistent with original)
        Assert.assertTrue("Expected NullPointerException", e instanceof NullPointerException);
      }
  }

  /**
   * Given an array where two positions reference the same MeuItem instance,
   * When max(...) is invoked with a large second parameter,
   * Then a NullPointerException is expected due to remaining null slots in the array.
   *
   * This test documents the behavior when duplicate references exist in the input.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = meuItem0;
      itemArray0[1] = meuItem0; // same instance intentionally reused

      Assert.assertSame("Slots 0 and 1 should reference the same MeuItem instance", itemArray0[0], itemArray0[1]);
      Assert.assertNull("Slot 2 should be null to provoke traversal of null entries", itemArray0[2]);

      // When / Then - expect NullPointerException
      try {
        Max.max(itemArray0, 560);
        Assert.fail("Expected NullPointerException when calling Max.max with sparse array and duplicate item references");
      } catch (NullPointerException e) {
        Assert.assertTrue("Expected a NullPointerException to be thrown", e instanceof NullPointerException);
      }
  }

  /**
   * Given an empty logical array (all slots null),
   * When max(...) is invoked for valid small indices,
   * Then the result should be null (no maximum item found).
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: an array of length 2 with no populated entries (all null)
      Item[] itemArray0 = new Item[2];

      // Precondition checks
      Assert.assertEquals("Array should have length 2", 2, itemArray0.length);
      Assert.assertNull("Slot 0 should initially be null", itemArray0[0]);
      Assert.assertNull("Slot 1 should initially be null", itemArray0[1]);

      // When
      Item item0 = Max.max(itemArray0, 0);

      // Then: no item should be returned
      Assert.assertNull("Max.max should return null when all entries are null (index 0)", item0);

      // Additional happy-path check for the other valid index to exercise boundary
      Item item1 = Max.max(itemArray0, 1);
      Assert.assertNull("Max.max should return null when all entries are null (index 1)", item1);
  }

  /**
   * Validate that the Max class can be instantiated and has expected basic properties.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given / When
      Max max0 = new Max();

      // Then - basic sanity checks
      Assert.assertNotNull("Constructed Max instance should not be null", max0);
      Assert.assertTrue("Constructed object should be an instance of Max", max0 instanceof Max);
  }
}