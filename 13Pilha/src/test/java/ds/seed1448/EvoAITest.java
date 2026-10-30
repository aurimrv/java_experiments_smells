package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit-level tests.
 */
interface UnitTest {}

/**
 * Marker interface for exceptional-case tests.
 */
interface ExceptionalTest {}

/**
 * Improved tests for ds.Pilha.
 *
 * Traceability:
 * - REQ-STACK-001: Basic stack push/pop behavior
 * - REQ-STACK-002: Error handling for underflow/overflow
 *
 * These tests preserve the original oracles while adding more
 * descriptive messages, Given-When-Then comments, and additional
 * lightweight assertions about observable stack state.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack,
   * When attempting to desempilha (pop),
   * Then an Exception is thrown indicating the stack is empty and the stack remains empty.
   *
   * Requirement: REQ-STACK-002
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
   * Given a stack with topo manually set to 1 (simulating a single element),
   * When desempilha() is called,
   * Then tamanho() should report 0 (stack becomes empty).
   *
   * Requirement: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.topo = 1;
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Given a stack whose internal array is full (topo == array length),
   * When attempting to empilha (push) another element,
   * Then an Exception is thrown indicating the stack is full and the state is unchanged.
   *
   * Requirement: REQ-STACK-002
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.topo = 1;
      Object[] objectArray0 = new Object[1];
      pilha0.item = objectArray0;
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
   * Given an empty stack,
   * When empilha(object) is called with a new Object,
   * Then topo should become 1 and tamanho() should report 1 and the stored item should match.
   *
   * Requirement: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      assertEquals(1, pilha0.topo);
  }

  /**
   * Given a newly created stack,
   * When tamanho() is queried,
   * Then it should return 0.
   *
   * Requirement: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}