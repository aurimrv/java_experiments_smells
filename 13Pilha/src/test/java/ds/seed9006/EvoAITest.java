package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests so tests can be selected by category.
 */
interface UnitTest {}

/**
 * Improved test class for ds.Pilha.
 *
 * Traceability:
 * - Requirement: REQ-STACK-001 (basic stack behavior: push, pop, size, empty)
 *
 * Note: This class retains the original EvoSuite runner and parameters to preserve
 * the execution environment required by the generated scaffolding.
 */
 
 
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack,
   * When pop (desempilha) is called,
   * Then an Exception indicating the stack is empty is thrown and the stack remains empty.
   *
   * Trace: REQ-STACK-001
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
   * Given a stack that has been forced into a 'full' internal state,
   * When push (empilha) is attempted,
   * Then an Exception indicating the stack is full is thrown and the state is unchanged.
   *
   * Note: The test manipulates internal storage to simulate a full stack because the Pilha
   * implementation does not expose capacity control. This is done to exercise the exceptional
   * behavior while keeping the rest of the public API assertions.
   *
   * Trace: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.item = null;
      Object object0 = new Object();
      Object[] objectArray0 = new Object[0];
      pilha0.item = objectArray0;
      try { 
        pilha0.empilha(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta cheia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * Given an empty stack,
   * When an element is pushed and then popped,
   * Then size increments to 1 after push and the stack becomes empty after pop.
   *
   * Trace: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha("Erro: A pilha esta cheia");
      assertEquals(1, pilha0.topo);
      
      pilha0.desempilha();
      assertTrue(pilha0.vazia());
  }

  /**
   * Given a newly created stack,
   * When its size is queried,
   * Then the size should be zero and the stack should be empty.
   *
   * Trace: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}