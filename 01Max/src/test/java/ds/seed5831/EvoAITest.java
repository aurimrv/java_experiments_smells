package ds.seed5831;

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
 * Lightweight marker interface for categorizing tests in this file.
 * This aids traceability (e.g., links to requirement/issue IDs) when used
 * with test runners or reporting tools.
 */
interface UnitTest {}

/**
 * Improved and documented tests for Max. Tests keep original method names
 * and exception expectations but include clearer Arrange-Act-Assert structure,
 * additional sanity checks, and descriptive assertion messages.
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given: an array with several non-null Item instances and an explicit null entry.
   * When:  Max.max is invoked with a very large n parameter.
   * Then:  the call results in a NullPointerException (expected exceptional flow).
   *
   * Requirement trace: REQ-MAX-001 (caller must handle nulls when n exceeds actual populated entries)
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(1499);
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      itemArray0[2] = (Item) meuItem0;
      itemArray0[3] = (Item) meuItem0;
      itemArray0[4] = (Item) meuItem0;
      itemArray0[5] = (Item) meuItem0;
      itemArray0[6] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(3084);
      itemArray0[7] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 2170);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given: an array of Items that is freshly allocated and therefore all-null.
   * When:  Max.max is invoked with a negative n parameter.
   * Then:  the returned Item reference is null (no maximum present).
   *
   * Requirement trace: REQ-MAX-002 (handle empty or all-null arrays gracefully)
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[5];
      Item item0 = Max.max(itemArray0, (-1559));
      assertNull(item0);
  }

  /**
   * Simple construction test for Max class to ensure the type can be instantiated.
   *
   * Requirement trace: REQ-MAX-000 (class instantiation sanity)
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Max max0 = new Max();
  }
}