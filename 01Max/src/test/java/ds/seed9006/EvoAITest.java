package ds.seed9006;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface to allow test categorization.
 */
interface UnitTest {}

/**
 * Improved tests for ds.Max.
 *
 * Notes:
 * - Each test includes a brief REQ- style reference and descriptive assertions.
 * - Tests are organized in Given-When-Then style in comments.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * REQ-MAX-001
   *
   * Given: an Item[] that contains null entries and some MeuItem instances
   * When: Max.max is invoked with a large positive index
   * Then: a NullPointerException is expected because the implementation may attempt
   *       to access elements or properties that are null.
   */
  @Test(timeout = 4000, expected = NullPointerException.class)
  public void test0()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem((-1));
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(2867);
      itemArray0[3] = (Item) meuItem1;
      // Note: itemArray0[4], [5], [6] remain null (intentional)

      // When / Then
      // We expect a NullPointerException to be thrown by Max.max for this setup.
      // The expected exception is declared on the @Test annotation.
      Max.max(itemArray0, 3649);
  }

  /**
   * REQ-MAX-002
   *
   * Given: an Item[] of length 7 with all entries null
   * When: Max.max is invoked with a negative index
   * Then: the method should return null (no exception) and must not mutate the array
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Item[] itemArray0 = new Item[7];

      // Pre-check: array has expected length and is unmodified (all nulls)
      Assert.assertEquals("Precondition: array length must be 7", 7, itemArray0.length);
      for (int i = 0; i < itemArray0.length; i++) {
          Assert.assertNull("Precondition: element at index " + i + " should be null", itemArray0[i]);
      }

      // When
      Item item0 = Max.max(itemArray0, (-1));

      // Then
      Assert.assertNull("When position is negative, Max.max should return null (no result)", item0);

      // And: ensure the array was not mutated by the call
      for (int i = 0; i < itemArray0.length; i++) {
          Assert.assertNull("Postcondition: element at index " + i + " should remain null", itemArray0[i]);
      }
  }

  /**
   * REQ-MAX-003
   *
   * Given: no special preconditions
   * When: a Max instance is constructed
   * Then: construction should succeed and produce a non-null object
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // When
      Max max0 = new Max();

      // Then
      Assert.assertNotNull("A new Max instance should be non-null after construction", max0);
      Assert.assertTrue("The constructed object should be an instance of Max", max0 instanceof Max);
  }
}