package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for ds.Pilha - improved, with clearer assertions and structure.
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
      pilha0.item = pilha0.item;
      pilha0.topo = 0;
      pilha0.topo = 1;
      Object[] objectArray0 = new Object[1];
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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      pilha0.empilha((Object) null);
      assertEquals(1, pilha0.topo);
      
      pilha0.desempilha();
      assertTrue(pilha0.vazia());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a newly created stack
      Pilha pilha0 = new Pilha();
      
      // When: query its size
      int int0 = pilha0.tamanho();
      // Then: size should be zero
      assertEquals("New stack should report size 0", 0, int0);
  }
}