package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface used to categorize unit tests in this file.
 * Placed at package level as required by JUnit Category usage.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue,
   * When an element is enqueued and the queue is printed,
   * Then the rear pointer (tras) should reflect one element in the queue.
   *
   * Requirement trace: REQ-QUEUE-ENQ-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("o)P&]5H9P");
      fila0.imprime();
      assertEquals(1, fila0.tras);
  }

  /**
   * Given an empty queue,
   * When attempting to dequeue,
   * Then an Exception is expected indicating the queue is empty.
   *
   * Requirement trace: REQ-QUEUE-DSC-EMPTY-001
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
   * Given a queue manipulated to appear full,
   * When attempting to enqueue another element,
   * Then an Exception is expected indicating the queue is full.
   *
   * Requirement trace: REQ-QUEUE-ENQ-FULL-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.frente = 1;
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
   * Given a queue with one element enqueued,
   * When that element is dequeued,
   * Then the returned element should match and the rear pointer should reflect the operation.
   *
   * Requirement trace: REQ-QUEUE-DEQ-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("o)P&]5H9P");
      fila0.desenfileira();
      assertEquals(1, fila0.tras);
  }
}