package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests.
 * Placed at package level so it can be used by @Category annotations.
 */
interface UnitTest {}

/**
 * Improved tests for ds.Fila.
 *
 * Notes:
 * - Kept original test method names and exception semantics (oracle preservation).
 * - Added descriptive messages and small structural comments (Given/When/Then).
 * - Added a package-level unit test category.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue, when an empty string is enqueued and imprime() is called,
   * then the queue should report that it is not empty.
   *
   * This test preserves the original call sequence:
   *   new Fila(); enfileira(""); imprime(); vazia() asserted false.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("");
      fila0.imprime();
      assertFalse(fila0.vazia());
  }

  /**
   * Given an empty queue, when desenfileira() is invoked, an Exception is expected
   * with the implementation-specific message. This preserves the original exceptional oracle.
   *
   * The test intentionally performs the same SUT calls as the original generated test:
   *   new Fila(); desenfileira(); expect Exception.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fila fila0 = new Fila();
      try { 
        fila0.desenfileira();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A fila esta vazia
         //
         verifyException("ds.Fila", e);
      }
  }

  /**
   * Given an empty queue, when an empty string is enqueued and then dequeued,
   * then the dequeued object should be the same empty string instance/value.
   *
   * Preserves original SUT calls:
   *   new Fila(); enfileira(""); desenfileira(); assertEquals("", object0);
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("");
      Object object0 = fila0.desenfileira();
      assertEquals("", object0);
  }
}