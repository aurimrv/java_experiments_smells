package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Marker interface for unit tests.
 */
interface UnitTest {}

/**
 * Marker interface for regression tests.
 */
interface RegressionTest {}

/**
 * Improved and annotated tests for ds.Fila.
 *
 * Note: This class preserves the original test method names and EvoSuite runner annotations
 * as required by the preservation rules.
 */
 
 
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue, when the queue enqueues itself and prints,
   * then it should no longer be empty.
   *
   * Requirement: REQ-QUEUE-ENQ-PRINT-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira(fila0);
      fila0.imprime();
      assertFalse(fila0.vazia());
  }

  /**
   * Given an empty queue, when attempting to dequeue, an Exception is expected.
   *
   * Requirement: REQ-QUEUE-DEQ-EMPTY-001
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
   * Given a queue that enqueues itself, when dequeued, the returned object should be
   * the same instance and should remain a valid (empty) queue object.
   *
   * Requirement: REQ-QUEUE-ENQ-DEQ-SELF-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira(fila0);
      Fila fila1 = (Fila)fila0.desenfileira();
      assertTrue(fila1.vazia());
  }
}