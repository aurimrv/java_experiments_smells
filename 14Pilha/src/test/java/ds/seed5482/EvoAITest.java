package ds.seed5482;

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
 * Improvements over generated tests:
 * - Added descriptive messages and Given-When-Then comments.
 * - Added basic pre/post-condition checks.
 * - Added traceability marker via @Category.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      pilha0.desempilha();
      assertEquals(0, pilha0.tamanho());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a fresh Pilha
      Pilha pilha0 = new Pilha();

      // When: query the size
      int int0 = pilha0.tamanho();

      // Then: size should be zero for newly created stack
      assertEquals("Newly constructed Pilha should report size 0", 0, int0);
  }
}