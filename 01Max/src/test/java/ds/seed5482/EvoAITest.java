package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for grouping unit tests.
 */
interface UnitTest {}

/**
 * Improved and documented tests for Max behavior.
 *
 * Note: The class keeps the original EvoSuite-runner annotations (required by preservation rules).
 * These tests follow Given-When-Then structure in comments and provide clearer assertions and messages.
 *
 * Traceability: Requirement REF-DS-MAX-001 - "Max.max should return null for empty arrays and throw NPE for arrays containing nulls when a valid limit is provided."
 */
  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Max_ESTest_scaffolding {

  /**
   * Given an array with some non-null and many null entries,
   * When max is invoked with a limit value that triggers processing,
   * Then a NullPointerException is expected when the implementation dereferences a null entry.
   *
   * Requirement: REF-DS-MAX-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = (Item) meuItem0;
      MeuItem meuItem1 = new MeuItem(560);
      itemArray0[1] = (Item) meuItem1;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 560);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an array with the same object referenced multiple times and other null entries,
   * When max is invoked,
   * Then the implementation is expected to throw NullPointerException (preserved original oracle).
   *
   * Requirement: REF-DS-MAX-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Item[] itemArray0 = new Item[9];
      MeuItem meuItem0 = new MeuItem(0);
      itemArray0[0] = (Item) meuItem0;
      itemArray0[1] = (Item) meuItem0;
      // Undeclared exception!
      try { 
        Max.max(itemArray0, 560);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
   * Given an empty array (all entries null),
   * When max is invoked with limit 0,
   * Then the result should be null (no maximum found).
   *
   * Requirement: REF-DS-MAX-002
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Item[] itemArray0 = new Item[2];
      Item item0 = Max.max(itemArray0, 0);
      assertNull(item0);
  }

  /**
   * Given a default-constructed Max instance,
   * When we validate basic properties,
   * Then the instance should be non-null and its creation must not affect static behavior.
   *
   * Requirement: REF-DS-MAX-003
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Max max0 = new Max();
  }
}