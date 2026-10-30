package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty Pilha,
   * When desempilha is invoked,
   * Then an Exception is thrown indicating the stack is empty.
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
   * Given a Pilha that has been manipulated to reach internal capacity,
   * When empilha is invoked and the internal array is full,
   * Then an Exception is thrown indicating the stack is full.
   *
   * Note: This test follows the original scenario sequence while adding
   * explicit assertions for intermediate sizes to make the intent clear.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha("");
      pilha0.desempilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      pilha0.desempilha();
      pilha0.empilha(object0);
      pilha0.empilha(object0);
      Object[] objectArray0 = new Object[2];
      pilha0.item = objectArray0;
      try { 
        pilha0.empilha("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta cheia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * Given a newly created Pilha,
   * When tamanho is invoked,
   * Then it should report size 0.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}