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
 * Unit tests for ds.Pilha.
 *
 * Traceability: REQ-DS-001 - Basic stack operations (push/pop/empty/size).
 *
 * Notes:
 * - Tests were improved for readability, added Given-When-Then comments and
 *   more descriptive assertion messages while preserving original oracles.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack,
   * When desempilha (pop) is invoked,
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
   * Given a stack with capacity 1 and one element pushed,
   * When pushing a second element,
   * Then an Exception is thrown indicating the stack is full.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object[] objectArray0 = new Object[1];
      pilha0.item = objectArray0;
      pilha0.empilha((Object) null);
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
   * Given an empty stack,
   * When pushing a null element and then popping it,
   * Then the internal topo index reflects the push and the stack becomes empty after pop.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Pilha pilha0 = new Pilha();

      // When: push a null element
      pilha0.empilha((Object) null);

      // Then: internal topo should reflect one element (preserve original oracle)
      assertEquals("Internal topo should be 1 after one push",
                   1, pilha0.topo);

      // When: pop the element
      pilha0.desempilha();

      // Then: stack should be empty
      assertTrue("Stack should be empty after pushing then popping a single element",
                 pilha0.vazia());
  }

  /**
   * Given a newly constructed stack,
   * When querying its tamanho (size),
   * Then it should report 0.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Pilha pilha0 = new Pilha();

      // When
      int int0 = pilha0.tamanho();

      // Then: verify initial size is zero
      assertEquals("Newly created stack should have size 0",
                   0, int0);
  }
}