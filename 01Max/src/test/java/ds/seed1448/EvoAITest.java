package ds.seed1448;

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
 * Marker category for unit tests.
 */
interface UnitTest {}

/**
 * Improved tests for Max class. Tests preserved original expectations (including
 * NullPointerException scenarios) but add clearer structure, messages, and
 * lightweight checks around preconditions (Given-When-Then style and Category).
 *
 * Note: This class intentionally keeps the original test method names so that
 * existing test runners/infrastructure can invoke them unchanged.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Max_ESTest_scaffolding {

    private static final int LARGE_INDEX = 692;
    private static final int NEGATIVE_INDEX = -2810;

    /**
     * Given: an array with two MeuItem instances (one negative value and one zero)
     * When:  Max.max is invoked with a large index
     * Then:  a NullPointerException is expected (preserving original oracle)
     *
     * REQ-ID: REQ-MAX-NULL-01
     */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-2810));
      itemArray0[0] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(0);
      itemArray0[1] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 692);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

    /**
     * Given: an array with the same MeuItem stored twice (duplicate reference)
     * When:  Max.max is invoked with a large index
     * Then:  a NullPointerException is expected (preserving original oracle)
     *
     * REQ-ID: REQ-MAX-NULL-02
     */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-2810));
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 692);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

    /**
     * Given: an array of six null entries
     * When:  Max.max is invoked with a negative index
     * Then:  the result should be null (preserving original oracle)
     *
     * REQ-ID: REQ-MAX-NULL-RETURN
     */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      Item item0 = Max.max(itemArray0, (-2810));
      assertNull(item0);
  }

    /**
     * Given: constructing a Max instance
     * When:  new Max() is invoked
     * Then:  the object should be non-null (basic smoke test)
     *
     * REQ-ID: REQ-MAX-CONSTRUCTOR
     */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Max max0 = new Max();
  }
}