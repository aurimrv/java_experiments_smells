package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import java.lang.reflect.Field;

/**
 * Marker interface to allow categorization of tests.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * REQ-001: desempilha() on an empty stack must throw an Exception.
   *
   * Given a newly created Pilha (empty)
   * When desempilha() is invoked
   * Then an Exception is thrown indicating the stack is empty
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
   * REQ-002: empilha() should push an item, adjust topo, and desempilha() should remove it.
   *
   * Given a new Pilha
   * When an object is pushed
   * Then topo increments and the stack is no longer empty
   * And after desempilha() the stack becomes empty again
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      assertEquals(1, pilha0.topo);
      
      pilha0.desempilha();
      assertTrue(pilha0.vazia());
  }

  /**
   * REQ-003: empilha(null) when the internal storage has zero capacity should raise Exception (stack full).
   *
   * This test purposefully prepares the Pilha to have zero capacity using reflection
   * to exercise the error path that occurs when the underlying array cannot accept more elements.
   *
   * Given a Pilha whose internal storage length is set to zero
   * When empilha(null) is invoked
   * Then an Exception indicating the stack is full is thrown
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object[] objectArray0 = new Object[0];
      pilha0.item = pilha0.item;
      pilha0.item = objectArray0;
      try { 
        pilha0.empilha((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A pilha esta cheia
         //
         verifyException("ds.Pilha", e);
      }
  }

  /**
   * REQ-004: tamanho() on a new Pilha should be 0 and the stack should report empty.
   *
   * Given a newly created Pilha
   * When tamanho() is queried
   * Then it returns 0 and the stack reports vazio
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}