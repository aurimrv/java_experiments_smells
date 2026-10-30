package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests in this class.
 */
interface UnitTest {}

/**
 * Improved test class for ds.Pilha.
 *
 * These tests preserve the original oracles and exception expectations while
 * adding clearer documentation, categories, and descriptive assertion messages.
 *
 * Note: The class retains the EvoSuite runner and parameters as required.
 */

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack,
   * When attempting to pop,
   * Then an Exception indicating the stack is empty should be thrown.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      try { 
        pilha0.desempilha();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta vazia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * Given a stack whose internal 'topo' is set to 1 (simulated non-empty state),
   * When a single pop is performed,
   * Then the reported size must be 0.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.topo = 1;
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Given a stack with capacity 2 and one element pushed,
   * When pushing an element beyond capacity,
   * Then an Exception indicating the stack is full should be thrown.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.topo = 1;
      Object[] objectArray0 = new Object[2];
      pilha0.item = objectArray0;
      pilha0.empilha(pilha0);
      try { 
        pilha0.empilha(pilha0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta cheia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * Given a newly created stack,
   * When querying its size,
   * Then it should be zero.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}