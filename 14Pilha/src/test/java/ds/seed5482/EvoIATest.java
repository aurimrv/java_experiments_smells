package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Pilha_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      try {
          pilha0.desempilha();
          fail("Expected Exception when desempilha called on empty stack");
      } catch(Exception e) {
          assertEquals("Erro: A pilha esta vazia", e.getMessage());
          assertTrue(e instanceof Exception);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      pilha0.empilha(object0);
      Object popped = pilha0.desempilha();
      assertEquals("Stack size should be zero after push and pop", 0, pilha0.tamanho());
      assertSame("Popped object should be the same as pushed", object0, popped);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      int int0 = pilha0.tamanho();
      assertEquals("New stack size should be zero", 0, int0);
  }
}