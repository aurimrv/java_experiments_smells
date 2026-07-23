package ds.seed6733;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Test both a happy path (valid count returns the expected maximum item)
   * and an error case (count larger than array length should throw a runtime exception).
   *
   * Given: an array filled with distinct MeuItem instances with increasing values
   * When:  Max.max is invoked with the full length
   * Then:  the item with the largest value is returned
   *
   * And: when invoked with an excessive count, a runtime exception is thrown.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      final int size = 7;
      Item[] items = buildSequentialMeuItems(size);

      // Verify setup
      for (int i = 0; i < size; i++) {
          assertNotNull("Precondition: each slot should be filled", items[i]);
      }

      // When: ask for max among all entries
      Item result = Max.max(items, items.length);

      // Then: the result should be the instance with the largest value (last created)
      // We created items with strictly increasing internal values, so the last one is the max.
      assertSame("Expected the last MeuItem (largest value) to be returned as max",
                 items[items.length - 1], result);

      // Error case: When requesting more elements than available, ensure a runtime exception is raised.
      try {
          Max.max(items, items.length + 10);
          fail("Expected a RuntimeException (e.g., ArrayIndexOutOfBoundsException or NullPointerException) when count exceeds array bounds");
      } catch (RuntimeException e) {
          // Accept any runtime exception that indicates improper usage; include an assertion to document expectation.
          assertTrue("Exception should indicate invalid count handling", e instanceof RuntimeException);
      }
  }

  /**
   * Boundary test: empty selection (n == 0) should return null.
   *
   * Given: an array allocated but with zero items requested
   * When:  Max.max is called with n == 0
   * Then:  the result is null
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: an array with capacity but no elements requested
      Item[] itemArray0 = new Item[4];

      // When: request max over zero elements
      Item item0 = Max.max(itemArray0, 0);

      // Then: result should be null (no elements considered)
      assertNull("When n == 0, Max.max should return null", item0);

      // Sanity: original array should remain unchanged (all nulls)
      for (int i = 0; i < itemArray0.length; i++) {
          assertNull("Array contents should remain null after calling Max.max with n == 0", itemArray0[i]);
      }
  }

  /**
   * Constructor sanity check for Max.
   *
   * Given: the Max class
   * When:  constructed via no-arg constructor
   * Then:  an instance is obtained and is non-null
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
      assertNotNull("Max instance should be creatable with no-arg constructor", max0);
      // Additional check: the instance should be of the expected runtime type
      assertTrue("Instance should be of type Max", max0 instanceof Max);
  }

  // Helper to reduce duplication: build an Item[] populated with MeuItem instances
  private static Item[] buildSequentialMeuItems(int count) {
      if (count < 0) {
          throw new IllegalArgumentException("count must be non-negative");
      }
      Item[] items = new Item[count];
      for (int i = 0; i < count; i++) {
          // Create MeuItem with strictly increasing values so that the last is the maximum.
          items[i] = new MeuItem(i + 1);
      }
      return items;
  }
}