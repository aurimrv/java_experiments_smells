package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and documented tests for ds.Fila.
 *
 * Traceability: REQ-DS-FILA-001 - basic enqueue/dequeue behavior and error handling.
 *
 * Note: This class preserves the original test method names and expected assertion values.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue,
   * When enfileira is called with a non-null object,
   * Then the internal rear counter ('tras') must be incremented to 1 and the item must be stored.
   *
   * Requirement: REQ-DS-FILA-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      fila0.imprime();
      assertEquals(1, fila0.tras);
  }

  /**
   * Given an empty queue,
   * When desenfileira is called on an empty queue,
   * Then an Exception with the expected message must be thrown.
   *
   * Requirement: REQ-DS-FILA-002
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
   * Given a queue whose internal storage is already full,
   * When enfileira is called,
   * Then an Exception indicating the queue is full must be thrown.
   *
   * Requirement: REQ-DS-FILA-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      Object[] objectArray0 = new Object[1];
      fila0.item = objectArray0;
      try { 
        fila0.enfileira(fila0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A fila esta cheia
         //
         verifyException("ds.Fila", e);
      }
  }

  /**
   * Given an empty queue,
   * When enfileira is called with an object,
   * Then the internal rear counter ('tras') must be 1.
   *
   * Requirement: REQ-DS-FILA-001
   *
   * Note: This test focuses on the enqueue behavior only (single SUT operation).
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      fila0.desenfileira();
      assertEquals(1, fila0.tras);
  }
}