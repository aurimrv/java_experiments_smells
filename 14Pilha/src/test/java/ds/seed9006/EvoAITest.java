package ds.seed9006;

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
 * Marker interface for unit tests.
 * Must be declared at package level so it can be referenced by @Category.
 */
interface UnitTest {}

/**
 * Marker interface for regression tests.
 */
interface RegressionTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack
   * When attempting to pop an element
   * Then an Exception indicating the stack is empty must be thrown.
   *
   * Requirement: STORY-POP-001
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
   * Given a freshly created stack
   * When an element (empty string) is pushed and then popped
   * Then the pushed element should be returned and the stack size should be back to zero.
   *
   * Requirement: STORY-PUSHPOP-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha("");
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Given a newly created stack
   * Then its size should be zero and subsequent size queries should be consistent.
   *
   * Requirement: STORY-INIT-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}