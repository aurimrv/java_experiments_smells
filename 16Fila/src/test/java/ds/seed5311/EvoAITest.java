package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for test categorization.
 */
interface UnitTest {}

/**
 * Improved and more descriptive unit tests for ds.Fila.
 *
 * NOTE: This class preserves the original test method names and the EvoRunner
 * configuration required by the test infrastructure. Tests follow a
 * Given-When-Then structure and include assertion messages for clarity.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: a fresh, empty queue
      Fila fila0 = new Fila();

      // When: an element is enqueued and the queue is printed (printing should be a no-op for state)
      fila0.enfileira("BFvX4s");
      fila0.imprime();

      // Then: the queue should report it is not empty
      assertFalse("After enfileira and imprime, the queue should not be empty", fila0.vazia());
  }

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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a fresh queue with a single enqueued element
      Fila fila0 = new Fila();
      fila0.enfileira("BFvX4s");

      // When: the element is dequeued
      Object object0 = fila0.desenfileira();

      // Then: the dequeued value must equal the value that was enqueued
      assertEquals("Dequeued element should match the enqueued value", "BFvX4s", object0);
  }
}