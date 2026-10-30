package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and clarified tests for ds.Lista behaviour.
 *
 * Note: Tests preserve original oracles and expected exception handling.
 * Each test follows a Given-When-Then (Arrange-Act-Assert) structure, and
 * includes brief traceability tags in the Javadoc for maintainability.
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Req: REQ-DS-001
   * Given a newly constructed Lista,
   * When imprime() is invoked on an empty list,
   * Then internal indices remain at their initialized values.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.imprime();
      assertEquals(0, lista0.ultimo);
      assertEquals((-1), lista0.pos);
  }

  /**
   * Req: REQ-DS-002
   * Given a newly constructed Lista,
   * When vazia() is queried,
   * Then it should report true and initial indices should be consistent.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lista lista0 = new Lista();
      boolean boolean0 = lista0.vazia();
      assertTrue(boolean0);
      assertEquals((-1), lista0.pos);
      assertEquals(0, lista0.primeiro);
  }

  /**
   * Req: REQ-DS-003
   * Given an empty Lista,
   * When a single element is inserted,
   * Then ultimo should reflect the new size and vazia() should be false.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lista lista0 = new Lista();
      lista0.insere("7aCMFv6z.g!o)");
      boolean boolean0 = lista0.vazia();
      assertEquals(1, lista0.ultimo);
      assertFalse(boolean0);
  }

  /**
   * Req: REQ-DS-004
   * Given a Lista with a pre-sized item array,
   * When attempting to insert more elements than capacity,
   * Then an Exception stating the list is full should be thrown.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Arrange: prepare a Lista and limit its capacity by replacing item array
      Lista lista0 = new Lista();
      Object[] objectArray0 = new Object[1];
      lista0.item = objectArray0;

      // Act: insert one element to fill the list
      lista0.insere("tVv!\"! i$6{(BRb_EA");

      // Assert: inserting another element should raise Exception "Erro: A lista esta cheia"
      try { 
        lista0.insere(objectArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A lista esta cheia
         //
         verifyException("ds.Lista", e);
      }
  }

  /**
   * Req: REQ-DS-005
   * Given an empty Lista,
   * When an element is inserted and imprime() is called,
   * Then ultimo should indicate one element present.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Arrange: new list
      Lista lista0 = new Lista();

      // Act: insert an element and print the list
      lista0.insere("tVv!\"! i$6{(BRb_EA");
      lista0.imprime();

      // Assert: ultimo must reflect the single insertion
      assertEquals("ultimo should be 1 after one insertion and print", 1, lista0.ultimo);
  }
}