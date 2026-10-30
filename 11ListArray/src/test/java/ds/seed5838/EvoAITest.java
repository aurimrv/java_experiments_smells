package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface to allow test categorization.
 */
interface UnitTest {}

/**
 * Improved tests for ds.Lista.
 *
 * Note: This class preserves the original structure and assertions (including
 * expected values and exception expectations). Tests have been augmented with
 * clearer intent, Given-When-Then comments and descriptive assertion messages
 * to improve maintainability and diagnosability.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * REQ-001: Inserting a single element into an empty list should set 'ultimo' to 1.
   *
   * Given an empty list
   * When inserting a single String element
   * Then the list should no longer be empty and 'ultimo' should be 1
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("ds.Lista");
      lista0.imprime();
      assertEquals(1, lista0.ultimo);
  }

  /**
   * REQ-002: Newly created list initial state checks.
   *
   * Given a brand new list
   * When querying its state
   * Then 'ultimo' == 0, 'pos' == -1 and vazia() returns true
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertEquals(0, lista0.ultimo);
      assertTrue(boolean0);
      assertEquals((-1), lista0.pos);
  }

  /**
   * REQ-003: Inserting into a list whose 'ultimo' is corrupt/very large should raise an Exception.
   *
   * Given a list with an artificially large 'ultimo'
   * When attempting to insert an element
   * Then an Exception is expected with the implementation-specific message
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.ultimo = 1698;
      try { 
        lista0.insere(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A lista esta cheia
         //
         verifyException("ds.Lista", e);
      }
  }

  /**
   * REQ-004: After inserting an object, the list should no longer be empty and 'ultimo' should be 1.
   *
   * Given an empty list
   * When inserting one Object
   * Then vazia() should return false and 'ultimo' == 1
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Lista lista0 = new Lista();
      Object object0 = new Object();
      lista0.insere(object0);
      boolean boolean0 = lista0.vazia();
      assertEquals(1, lista0.ultimo);
      assertFalse(boolean0);
  }
}