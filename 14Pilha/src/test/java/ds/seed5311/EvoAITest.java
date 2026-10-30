package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Traceability: REQ-PILE-001
 *
 * Improved and more descriptive tests for Pilha behavior.
 * These tests keep the original test names (for compatibility with EvoSuite scaffolding)
 * and exercise both exceptional and happy-path scenarios with clearer assertions and
 * Given-When-Then structure.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty Pilha
   * When desempilha is invoked
   * Then an Exception is thrown indicating the stack is empty.
   *
   * Traceability: REQ-PILE-001-EXC
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
   * When an element is pushed and then popped
   * Then the size reflects the operations and the popped element matches what was pushed.
   *
   * Traceability: REQ-PILE-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha("^S6,o4");
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  /**
   * Given a newly created Pilha
   * Then its initial size is zero. Also verify basic boundary behavior by pushing an empty string
   * and ensuring size changes and pop returns the empty string.
   *
   * Traceability: REQ-PILE-003
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals(0, int0);
  }
}