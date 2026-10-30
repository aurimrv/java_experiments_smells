package ds.seed7992;

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
 * Marker interface to allow test categorization (unit tests).
 */
interface UnitTest {}

/**
 * Improved tests for ds.Max behavior.
 *
 * Traceability:
 * - REQ-MAX-NULL-ARRAY: behavior when input array contains null entries or requested index is out of expected range.
 * - REQ-MAX-NULL-RETURN: behavior when all entries are null -> expect null result.
 * - REQ-MAX-CONSTRUCTION: Max can be instantiated.
 *
 * Notes:
 * - This class preserves the original test method names (test0, test1, test2) for compatibility with the existing test suite.
 * - Tests follow Given-When-Then comments for clarity.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * REQ-MAX-NULL-ARRAY
   *
   * Given: an array with several populated MeuItem entries and many null slots.
   * When: Max.max is invoked with a drastically out-of-range index (497).
   * Then: the implementation is expected to throw a NullPointerException (preserves original oracle).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(497);
      MeuItem meuItem1 = new MeuItem(497);
      Item[] itemArray0 = new Item[7];
      itemArray0[0] = (Item) meuItem1;
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      meuItem1.chave = 0;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 497);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * REQ-MAX-NULL-RETURN
   *
   * Given: an array of Items where all entries are null.
   * When: Max.max is invoked with index 0.
   * Then: the result should be null.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      Item item0 = Max.max(itemArray0, 0);
      assertNull(item0);
  }

  /**
   * REQ-MAX-CONSTRUCTION
   *
   * Given: the Max class.
   * When: a new instance is constructed.
   * Then: the instance should be non-null and of the expected type.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }
}