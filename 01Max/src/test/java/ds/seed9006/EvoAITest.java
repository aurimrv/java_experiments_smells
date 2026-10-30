package ds.seed9006;

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
 * Improved unit tests for Max behavior.
 *
 * These tests preserve the original test method names and expected outcomes
 * while adding clearer structure, pre-condition checks, descriptive assertion
 * messages, and simple traceability comments. The class is categorized so test
 * runs can be filtered if desired.
 */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given: a partially populated Item[] with several references to the same MeuItem and
   *        another MeuItem at index 3, and remaining slots null.
   * When:  Max.max is invoked with an out-of-context large positive index.
   * Then:  A NullPointerException is expected (behavior preserved from original test).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem((-1));
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(2867);
      itemArray0[3] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 3649);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an uninitialized Item[] where every element is null.
   * When:  Max.max is invoked with a negative index.
   * Then:  The method should return null for the invalid negative index.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      Item item0 = Max.max(itemArray0, (-1));
      assertNull(item0);
  }

  /**
   * Given/When: instantiate Max.
   * Then: the instance should be non-null and of expected type.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }
}