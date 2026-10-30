package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Improved and stabilized tests for ds.Lista.
 * Tests kept with original method names and behavior (oracles preserved).
 *
 * Notes:
 * - Added Category marker and descriptive assertion messages.
 * - Reworked test that originally manipulated internal fields to instead
 *   exercise the public API until the list reports being full (by throwing).
 * - Preserved  and  exactly as required.
 */

/* Marker interface for categorizing these tests */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("7E3jkEp ");
      lista0.imprime();
      assertEquals(1, lista0.ultimo);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertEquals((-1), lista0.pos);
      assertEquals(0, lista0.ultimo);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a new Lista and an element to insert repeatedly
      Lista lista0 = new Lista();
      Object object0 = new Object();

      // When: repeatedly inserting until the list reports being full by throwing an Exception.
      // This avoids directly manipulating internal fields while still exercising the failure behavior.
      try { 
        int safety = 0;
        // Keep inserting until an exception indicates the list is full.
        while (true) {
          lista0.insere(object0);
          safety++;
          // Safety guard to avoid an infinite loop in unexpected cases.
          if (safety > 10000) {
            fail("Exceeded safety insertion limit without receiving expected Exception indicating a full list");
          }
        }
      } catch(Exception e) {
         // Then: an exception originating from ds.Lista is expected (preserve original oracle)
         verifyException("ds.Lista", e);
      }
  }

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