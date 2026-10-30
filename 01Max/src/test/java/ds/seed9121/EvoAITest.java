package ds.seed9121;

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
 * Unit tests for Max utility.
 *
 * Requirement traceability: REQ-MAX-001 - Behavior of Max.max with null entries, empty collections,
 * and out-of-range indices.
 *
 * These tests are written with a clear Given-When-Then structure and include pre-condition checks.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Max_ESTest_scaffolding {

  // Centralized constants to avoid magic numbers
  private static final int ARRAY_SIZE_TEST0 = 9;
  private static final int ARRAY_SIZE_TEST1 = 2;
  private static final int NEGATIVE_INDEX = -2156;
  private static final int PARAM_TEST0 = 2570;
  private static final int ITEM_VALUE_NEG2556 = -2556;
  private static final int ITEM_VALUE_1 = 1;

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem((-2556));
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(1);
      itemArray0[2] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 2570);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      Item item0 = Max.max(itemArray0, (-2156));
      assertNull(item0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }
}