package ds.seed5831;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * REQ-001: Given an array with populated and null slots, when max(...) is invoked with an
   * out-of-range/large rank, then the implementation should either raise NullPointerException
   * (if it dereferences a null slot) or an IndexOutOfBoundsException. This test documents the
   * expected behavior and verifies basic array setup before exercising the call.
   *
   * Given: an Item[] of length 9 with several repeated instances and one explicit null slot.
   * When: calling Max.max(items, 2170).
   * Then: NullPointerException is expected, but IndexOutOfBoundsException is accepted as
   * an alternative implementation behavior.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(1499);
      for (int i = 0; i < 7; i++) {
          itemArray0[i] = (Item) meuItem0;
      }
      MeuItem meuItem1 = new MeuItem(3084);
      itemArray0[7] = (Item) meuItem1;
      // leave itemArray0[8] as null intentionally

      // Preconditions / sanity checks
      assertEquals("Array should have length 9", 9, itemArray0.length);
      assertSame("Entries 0 and 1 should reference the same MeuItem instance", itemArray0[0], itemArray0[1]);
      assertNotNull("Entry 7 should be populated", itemArray0[7]);
      assertNull("Entry 8 should be null for this test scenario", itemArray0[8]);

      // When / Then: expect NPE due to null slot dereference OR IndexOutOfBounds as acceptable alternative
      try {
          Max.max(itemArray0, 2170);
          fail("Expected NullPointerException or IndexOutOfBoundsException when calling max with an out-of-range rank");
      } catch (NullPointerException e) {
          // expected behavior in some implementations
      } catch (IndexOutOfBoundsException e) {
          // also acceptable as an alternative implementation choice
      }
  }

  /**
   * REQ-002: When the array contains only null entries, calling max(...) with an invalid
   * (negative) rank should not produce a non-null Item. This verifies handling of a fully-null array.
   *
   * Given: an Item[] of length 5 with all null elements.
   * When: calling Max.max(items, -1559).
   * Then: the result is expected to be null.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[5]; // all slots are null by default
      assertEquals("Precondition: array length must be 5", 5, itemArray0.length);
      for (int i = 0; i < itemArray0.length; i++) {
          assertNull("Precondition: each slot should be null before the call (index " + i + ")", itemArray0[i]);
      }

      // When
      Item item0 = Max.max(itemArray0, (-1559));

      // Then
      assertNull("When all elements are null and rank is negative, result should be null", item0);
  }

  /**
   * REQ-003: Construction test for Max (utility class). Ensures that an instance can be created
   * and basic object characteristics hold (non-null, correct class, toString result non-null).
   *
   * Given: nothing special.
   * When: constructing a new Max instance.
   * Then: the instance is non-null and usable.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
      // Given / When
      Max max0 = new Max();

      // Then - basic sanity assertions about the constructed object
      assertNotNull("Max instance should not be null after construction", max0);
      assertEquals("Constructed object should be of type ds.Max", Max.class, max0.getClass());
      assertNotNull("toString() should not return null", max0.toString());
  }
}