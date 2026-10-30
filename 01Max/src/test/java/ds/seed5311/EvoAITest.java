package ds.seed5311;

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
 * Marker interface for fast unit tests.
 */
interface UnitTest {}

/**
 * Improved tests for Max functionality.
 *
 * Note: This class preserves original EvoSuite execution annotations and the
 * original test method names and exception oracles.
 */
  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given an array partially populated with MeuItem instances and many nulls,
   * when Max.max is invoked with a very large k (well beyond array bounds),
   * then a NullPointerException is expected (preserving original oracle).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[7];
      MeuItem meuItem0 = new MeuItem(1323);
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(3780);
      itemArray0[2] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 1323);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array of length 6 with all entries null,
   * when Max.max is invoked with k = 0,
   * then the result should be null (no maximum computed).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      Item item0 = Max.max(itemArray0, 0);
      assertNull(item0);
  }

  /**
   * Simple construction smoke-test for Max instance.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }
}