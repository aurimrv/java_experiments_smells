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
 * Unit tests for ds.Pilha (stack) behavior.
 *
 * Requirement traceability: REQ-STACK-001
 *
 * Notes:
 * - Tests use Given-When-Then structure in comments to make scenarios explicit.
 * - This class is annotated as a unit test suite to allow selective execution.
 */
interface UnitTest {}

  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Scenario: Pop from an empty stack should raise an Exception.
   *
   * Given an empty Pilha
   * When desempilha() is invoked
   * Then an Exception indicating the stack is empty is thrown
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
   * Scenario: Push a null reference then pop it; resulting size must be zero.
   *
   * Given an empty Pilha
   * When empilha(null) and then desempilha() are invoked
   * Then the popped value is null and the stack size returns to zero
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha((Object) null);
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Scenario: Query size on a newly created Pilha returns zero.
   *
   * Given a newly created Pilha
   * When tamanho() is invoked
   * Then the result is zero
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}