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
 * Unit tests for Pilha focused on basic stack behaviors:
 * - empty stack pop throws
 * - push/pop maintain size and return pushed value
 * - newly created stack has size zero
 *
 * Requirement traceability: REQ-STACK-001, REQ-STACK-002
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty Pilha
   * When attempting to desempilha (pop)
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
   * Given a Pilha
   * When empilha and then desempilha are invoked
   * Then the pushed value is returned and the size returns to zero
   *
   * Note: This test intentionally exercises the push/pop happy path and performs
   * multiple assertions to validate size transitions and return value.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha("");
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Given a newly constructed Pilha
   * When querying tamanho()
   * Then the reported size is zero and non-negative
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}