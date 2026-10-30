package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests as unit tests.
 * Placed at package level so it can be used with @Category on the test class.
 */
interface UnitTest {}

/**
 * Improved and documented tests for ds.Fila.
 *
 * Notes:
 * - Preserves the original test method names and exception expectations.
 * - Adds Given-When-Then style comments, brief requirement traceability IDs,
 *   descriptive assertion messages, and a test category.
 *
 * ORACLE PRESERVATION:
 * - Keeps  and  unchanged.
 * - Keeps all caught exception types and expected assertion values identical.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * REQ-QUEUE-001: Enqueuing a null value and then printing should surface a NullPointerException.
   *
   * Given a new queue
   * When a null element is enqueued and imprime() is invoked
   * Then a NullPointerException is expected
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira((Object) null);
      // Undeclared exception!
      try { 
        fila0.imprime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
   * REQ-QUEUE-002: Printing an empty queue should complete without exception and leave 'tras' as 0.
   *
   * Given a new empty queue
   * When imprime() is invoked
   * Then it should not throw and tras should be 0
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.imprime();
      assertEquals(0, fila0.tras);
  }

  /**
   * REQ-QUEUE-003: Dequeuing from an empty queue must raise an Exception indicating the queue is empty.
   *
   * Given a new empty queue
   * When desenfileira() is invoked
   * Then an Exception is expected with message indicating the queue is empty
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
   * REQ-QUEUE-004: Enqueuing a null element and then dequeuing should advance 'frente' by 1.
   *
   * Given a new queue
   * When a null is enqueued and then desenfileira() is called
   * Then 'frente' should be 1
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira((Object) null);
      fila0.desenfileira();
      assertEquals(1, fila0.frente);
  }

  /**
   * REQ-QUEUE-005: Attempting to enqueue when the queue is set to a state that indicates 'full'
   * should raise an Exception with the appropriate message.
   *
   * Given a queue whose 'frente' field has been set to 1 (simulating near-full/edge state)
   * When enfileira(...) is invoked
   * Then an Exception indicating the queue is full is expected
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.frente = 1;
      try { 
        fila0.enfileira("w6Cp`x , C$&nvOO-");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A fila esta cheia
         //
         verifyException("ds.Fila", e);
      }
  }
}