package ds.seed9121;

import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interfaces for categorization of tests.
 * Defined at package scope as required by the test rules.
 */
interface UnitTest {}
interface ExceptionTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty Pilha,
   * when desempilha is invoked,
   * then an Exception indicating the stack is empty is expected.
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
   * Given a fresh Pilha,
   * when an element is pushed and then popped,
   * then size reflects the push and the stack becomes empty after pop.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha("");
      assertEquals(1, pilha0.topo);
      
      pilha0.desempilha();
      assertTrue(pilha0.vazia());
  }

  /**
   * Given a Pilha with at least one element,
   * attempt to push elements until the Pilha rejects further pushes.
   * The test will fail if no capacity limit is encountered within a reasonable bound.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      Object[] objectArray0 = new Object[1];
      pilha0.item = objectArray0;
      try { 
        pilha0.empilha(objectArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta cheia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * Given a newly constructed Pilha,
   * then the reported size should be zero.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}