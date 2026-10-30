package ds.seed5838;

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
 * Marker interface for unit tests to allow categorization.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given: an array with a few populated MeuItem elements and remaining nulls.
   * When:  calling Max.max with an index outside typical bounds (2269).
   * Then:  a NullPointerException is expected (preserved oracle).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeuItem meuItem0 = new MeuItem(2207);
      MeuItem meuItem1 = new MeuItem((-1454));
      Item[] itemArray0 = new Item[9];
      itemArray0[0] = (Item) meuItem1;
      itemArray0[1] = (Item) meuItem1;
      itemArray0[2] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 2269);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: a newly allocated Item array with no elements populated.
   * When:  calling Max.max with a small positive index.
   * Then:  the result should be null (no maximum found).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      Item item0 = Max.max(itemArray0, 1);
      assertNull(item0);
  }

  /**
   * Given: constructing a Max instance.
   * When:  invoking the default constructor.
   * Then:  the created instance must not be null (basic sanity).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }
}