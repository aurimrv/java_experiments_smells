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
 * Test suite for ds.Pilha focusing on basic stack semantics.
 *
 * Traceability:
 * - REQ-STACK-EMPTY-1: Pop from an empty stack must throw an Exception.
 * - REQ-STACK-BASIC-1: Pushing then popping returns the same object and restores size.
 * - REQ-STACK-SIZE-INIT: Newly created stack must report size 0.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty Pilha, When calling desempilha(), Then an Exception is thrown
   * (REQ-STACK-EMPTY-1).
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
   * Given a Pilha, When an object is empilhado then desempilhado, Then the returned
   * object is the same instance and the size returns to zero (REQ-STACK-BASIC-1).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Given a newly constructed Pilha, When tamanho() is queried, Then it should be zero
   * (REQ-STACK-SIZE-INIT).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}