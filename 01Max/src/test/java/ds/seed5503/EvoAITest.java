package ds.seed5503;

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
import java.util.Arrays;

/**
 * Lightweight marker to categorize unit tests in this file.
 */
interface UnitTest {}

/**
 * Lightweight marker to categorize integration tests in this file.
 */
interface IntegrationTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Max_ESTest_scaffolding {

  private static final int DEFAULT_TIMEOUT = 4000;

  /**
   * Given: a sparse Item[] with only two MeuItem instances set and other entries null
   * When:  Max.max is invoked with a large index parameter
   * Then:  a NullPointerException is expected because the implementation accesses missing elements
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-728));
      itemArray0[0] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem((-333));
      itemArray0[1] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 390);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array where two positions reference the same MeuItem instance
   * When:  Max.max is called with a large index
   * Then:  expect a NullPointerException as the method likely iterates beyond initialized entries
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[6];
      MeuItem meuItem0 = new MeuItem((-728));
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 390);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an empty (all-null) array of Items
   * When:  Max.max is invoked at index 0
   * Then:  the method should return null (no max available)
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Item[] itemArray0 = new Item[8];
      Item item0 = Max.max(itemArray0, 0);
      assertNull(item0);
  }

  /**
   * Given: a simple construction of Max
   * When:  the constructor is invoked
   * Then:  the instance should be non-null and in a predictable initial state
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Max max0 = new Max();
  }
}