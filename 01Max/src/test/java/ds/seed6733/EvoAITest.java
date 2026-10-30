package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface to classify unit tests in this package.
 * Must be declared at package level (before the test class) so that
 * @Category annotations reference a visible type.
 */
interface UnitTest {}

/**
 * Improved test class for ds.Max behaviors.
 *
 * Traceability:
 * - Requirement: MAX-SELECT-001 (behavior of Max.max over arrays with null entries)
 * - Generated originally by EvoSuite; refactored to add structure, clarity, and assertions.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given an array with repeated MeuItem instances and some null entries,
   * when Max.max is invoked with a very large index argument,
   * then a NullPointerException is expected to be thrown by the implementation.
   *
   * This preserves the original oracle: a NullPointerException must be raised.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1562);
      itemArray0[6] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 2340);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array of four null Item references,
   * when Max.max is invoked starting at index 0,
   * then the result must be null and the input array must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[4];
      Item item0 = Max.max(itemArray0, 0);
      assertNull(item0);
  }

  /**
   * Simple construction sanity check for the Max helper class.
   *
   * Given: no special preconditions.
   * When: constructing a new Max instance.
   * Then: instance should be non-null and of the expected type.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }

  // --- Helper(s) -----------------------------------------------------------

  /**
   * Build an Item[] of the given size, filling the first repeatCount indices with the provided
   * repeated MeuItem instance, placing the special MeuItem at specialIndex (if within bounds),
   * and leaving the remainder as null.
   *
   * This utility centralizes array construction used by tests and reduces inline repetition.
   *
   * @param size total size of the array
   * @param repeated MeuItem instance to repeat at the beginning
   * @param specialIndex index to place the special MeuItem (ignored if out of range)
   * @param special special MeuItem to place at specialIndex
   * @param repeatCount how many leading positions to fill with the repeated MeuItem
   * @return constructed Item[] as described
   */
  private static Item[] buildArrayWithRepeatAndSpecial(int size, MeuItem repeated, int specialIndex, MeuItem special, int repeatCount) {
    Item[] arr = new Item[size];
    for (int i = 0; i < size; i++) {
      if (i < repeatCount) {
        arr[i] = repeated;
      } else if (i == specialIndex) {
        arr[i] = special;
      } else {
        arr[i] = null;
      }
    }
    return arr;
  }
}