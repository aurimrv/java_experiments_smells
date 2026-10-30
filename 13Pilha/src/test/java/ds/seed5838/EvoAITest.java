package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Requirement: STACK-EMPTY-001
   * Given an empty Pilha, When desempilha is invoked, Then an Exception should be thrown indicating the stack is empty.
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
   * Requirement: STACK-FULL-001
   * Given a Pilha with at least one element, When repeatedly empilha is invoked until capacity is reached, Then empilha should throw an Exception.
   *
   * Note: This test treats the Pilha as a black-box and fills it by repeated pushes until an exception is observed.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha((Object) null);
      Object object0 = pilha0.desempilha();
      pilha0.empilha((Object) null);
      Object[] objectArray0 = new Object[1];
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
   * Requirement: STACK-INIT-001
   * Given a newly constructed Pilha, When tamanho is queried, Then it should report zero.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}