package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Pilha_ESTest_scaffolding {

  private void expectEmptyStackException(Runnable action) {
    try {
      action.run();
      fail("Expected Exception when desempilha is called on empty stack");
    } catch(Exception e) {
      assertEquals("Erro: A pilha esta vazia", e.getMessage());
      verifyException("ds.Pilha", e);
    }
  }

  private void expectFullStackException(Runnable action) {
    try {
      action.run();
      fail("Expected Exception when empilha is called on full stack");
    } catch(Exception e) {
      assertEquals("Erro: A pilha esta cheia", e.getMessage());
      verifyException("ds.Pilha", e);
    }
  }

  private void setupPilhaWithTopoOne(Pilha pilha) {
    pilha.topo = 1;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    Pilha pilha0 = new Pilha();
    
    expectEmptyStackException(() -> {
    try {
        pilha0.desempilha();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
});
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    Pilha pilha0 = new Pilha();
    setupPilhaWithTopoOne(pilha0);
    pilha0.desempilha();
    assertEquals("Stack size should be zero after desempilha", 0, pilha0.tamanho());
  }


  @Test(timeout = 4000)
  public void test3() throws Throwable {
    Pilha pilha0 = new Pilha();
    int int0 = pilha0.tamanho();
    assertEquals("Stack size should be zero for new stack", 0, int0);
  }
}