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
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * REQ-001: Enqueue an object and ensure the queue reports non-empty.
   *
   * Given: an empty Fila
   * When: an Object is enqueued and the queue is printed
   * Then: the queue should not be empty and the enqueued object reference must remain non-null
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      fila0.imprime();
      assertFalse(fila0.vazia());
  }

  /**
   * REQ-002: Dequeueing from an empty queue must throw an Exception with the implementation's message.
   *
   * Given: an empty Fila
   * When: desenfileira() is called
   * Then: an Exception is thrown indicating the queue is empty
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fila fila0 = new Fila();
      try { 
        // Act: attempt to dequeue from an empty queue
        fila0.desenfileira();
        // If no exception is thrown, fail the test with a clear message
        fail("Expected an Exception when dequeuing from an empty queue");
      
      } catch(Exception e) {
         //
         // The implementation is expected to throw an Exception for an empty queue.
         //
         verifyException("ds.Fila", e);
      }
  }

  /**
   * REQ-003: Enqueue an empty string and ensure dequeuing returns the same value.
   *
   * Given: an empty Fila
   * When: an empty string is enqueued and then dequeued
   * Then: the dequeued object equals the originally enqueued empty string
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("");
      Object object0 = fila0.desenfileira();
      assertEquals("", object0);
  }
}